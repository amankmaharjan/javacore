import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");


            User user = new User();
            user.setFname("aman");
            user.setLname("maharjan");
            user.setAddress("manamaiju");
            user.setContact(1234);


            Statement stmt = con.createStatement();
           String insertQuery="INSERT INTO user (fname,lname,contact,address) VALUES('" + user.getFname() + "','" + user.getLname() + "','" + user.getContact() + "','" + user.getAddress() + "')";
           if(stmt.executeUpdate((insertQuery))>0){
               System.out.println("data inserted");
           }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
