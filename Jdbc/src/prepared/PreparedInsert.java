package prepared;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedInsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");


            String insertQuery = "INSERT INTO user (fname,lname,contact,address) VALUES(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);

            User user = new User();
            user.setFname("aman");
            user.setLname("maharjan");
            user.setAddress("manamaiju");
            user.setContact(1234);

            pstmt.setString(1, user.getFname());
            pstmt.setString(2, user.getLname());
            pstmt.setInt(3, user.getContact());
            pstmt.setString(4, user.getAddress());
            int i = pstmt.executeUpdate();

            System.out.println(i + " records inserted");


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
