package crud.dao.daoimpl;

import crud.dao.UserDAO;
import crud.dbconnection.ConnectionFactory;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


public class UserDAOImpl implements UserDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;

	public UserDAOImpl() {
		try {
			ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
			con = connectionFactory.getConnection();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void insert(User u) {
		try {
			pstmt = (PreparedStatement) con
					.prepareStatement("INSERT INTO user (fname,lname,contact,address) VALUES(?,?,?,?)");
			pstmt.setString(1, u.getFname());
			pstmt.setString(2, u.getLname());
			pstmt.setInt(3, u.getContact());
			pstmt.setString(4, u.getAddress());
			if (pstmt.executeUpdate() == 1) {
				System.out.println("User Record Inserted");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void update(User u) {
		try {
			pstmt = (PreparedStatement) con.prepareStatement(
					"UPDATE user SET fname=? , lname = ?, address = ?, contact = ? WHERE userID = ?");
			pstmt.setString(1, u.getFname());
			pstmt.setString(2, u.getLname());
			pstmt.setString(3, u.getAddress());
			pstmt.setInt(4, u.getContact());
			pstmt.setInt(5, u.getUserId());
			if (pstmt.executeUpdate() == 1) {
				System.out.println("Record Updated");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void delete(User u) {
		try {
			pstmt = (PreparedStatement) con.prepareStatement("DELETE FROM user WHERE userId = ?");
			pstmt.setInt(1, u.getUserId());
			if (pstmt.executeUpdate() == 1) {
				System.out.println("Deleted");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<User> display() {
		List<User> listofUser = new LinkedList<>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM user");
			while (rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("userId"));
				user.setFname(rs.getString("fname"));
				user.setLname(rs.getString("lname"));
				user.setAddress(rs.getString("address"));
				listofUser.add(user);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listofUser;
	}

	@Override
	public User findOne(int id) {
		try {
			pstmt = (PreparedStatement) con.prepareStatement("SELECT *FROM user WHERE userId = ?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				User findOneUser = new User();
				findOneUser.setUserId(rs.getInt("userID"));
				findOneUser.setFname(rs.getString("fname"));
				findOneUser.setLname(rs.getString("lname"));
				findOneUser.setAddress(rs.getString("address"));
				return findOneUser;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
