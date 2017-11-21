import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");



            User user=new User();
            user.setUserId(2);
            user.setFname("aman");

            Statement stmt = con.createStatement();
            String updateQuery="UPDATE `user` SET fname='"+user.getFname()+"'WHERE userId='"+user.getUserId()+"'";
            if(stmt.executeUpdate((updateQuery))>0){
                System.out.println("updated");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
