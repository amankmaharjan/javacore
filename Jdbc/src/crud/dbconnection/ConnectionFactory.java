package crud.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	/*Step 1
	 * create a ConnectionFactory Singleton class
	 * static member holds only one instance
	 */
	private static ConnectionFactory connectionFactory;
	
	/*Step 2
	 * prevents the instantiation from any other class
	 * */
	private ConnectionFactory(){
		
	}
	
	
	/*Step 3
	 * provide the global access point 
	 * */
	public static ConnectionFactory getInstance(){
		if (connectionFactory == null){
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
	}
}
