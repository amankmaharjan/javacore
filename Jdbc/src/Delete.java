import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");


            int id=1;
            Statement stmt = con.createStatement();
            String deleteQuery="DELETE FROM user WHERE userId = '"+id+"'";
            if(stmt.executeUpdate((deleteQuery))>0){
                System.out.println("deleted");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
