package prepared;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");

            String selectQuery = "select * from user";
            PreparedStatement pstmt = con.prepareStatement(selectQuery);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + rs.getString(4));

            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
