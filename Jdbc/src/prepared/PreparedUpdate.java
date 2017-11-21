package prepared;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");



            User user=new User();
            user.setUserId(4);
            user.setFname("dfdf");

            String updateQuery="UPDATE `user` SET fname=? WHERE userId=?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1,user.getFname());
            pstmt.setInt(2,user.getUserId());

            pstmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
