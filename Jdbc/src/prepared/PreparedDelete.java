package prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");


            int id = 2;
            String deleteQuery = "DELETE FROM user WHERE userId =?";
            PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
