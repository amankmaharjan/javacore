import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Select {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/demo", "root", "");
            Statement stmt = con.createStatement();
            String selectQuery = "select * from user";
            ResultSet rs = stmt.executeQuery(selectQuery);
            List<User> userList = new ArrayList<>();
            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + rs.getString(4));
                User user = new User();
                user.setUserId(rs.getInt(1));
                user.setFname(rs.getString(2));
                user.setLname(rs.getString("lname"));
                user.setContact(rs.getInt(4));
                user.setAddress(rs.getString(5));

                userList.add(user);

            }
            for (User u : userList
                    ) {
                System.out.println(u);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
