package crud.view;

import crud.dao.UserDAO;
import crud.dao.daoimpl.UserDAOImpl;
import model.User;

import java.util.List;
import java.util.Scanner;

public class UserView {
	private User user;
	private int id;
	private String confirm;
	private Scanner scanner;
	private static UserDAO userDAO=new UserDAOImpl();

	public void displayMenu() {


		System.out.println("please choose the menu");
		do {
			scanner = new Scanner(System.in);
			System.out.println("1.Insert user");
			System.out.println("2.Update user");
			System.out.println("3.Delete user");
			System.out.println("4.Display userList");
			int choice = scanner.nextInt();

			switch (choice) {
				case 1:
					insert();
					break;
				case 2:
					update();
					break;
				case 3:
					delete();
					break;
				case 4:
					display();
					break;
				default:
					System.out.println("input invalid");
			}
			System.out.println("do you want to continue?yes or no");
			confirm = scanner.next();

			if (confirm.equalsIgnoreCase("no"))
				System.exit(0);


		}
		while (confirm.equalsIgnoreCase("yes"));
		System.exit(0);

	}

	public void insert() {

		user = new User();

		System.out.println("1.Insert user details");
		System.out.println("name:");
		user.setFname(scanner.next());
		System.out.println("lname:");
		user.setLname(scanner.next());
		System.out.println("contact:");
		user.setContact(scanner.nextInt());
		System.out.println("address:");
		user.setAddress(scanner.next());
		userDAO.insert(user);

	}

	public void update() {
		user = new User();

		System.out.println("1.edit user");
		System.out.println("id:");
		int id = scanner.nextInt();

		if (userDAO.findOne(id) != null) {
			System.out.println(userDAO.findOne(id).toString());
			System.out.println("name:");
			user.setFname(scanner.next());
			System.out.println("lname:");
			user.setLname(scanner.next());
			System.out.println("contact:");
			user.setContact(scanner.nextInt());
			System.out.println("address:");
			user.setAddress(scanner.next());
			user.setUserId(id);
			userDAO.update(user);
		}
	}

	public void delete() {
		System.out.println("2.Delete ");
		System.out.println("id:");
		int id = scanner.nextInt();
		User user=new User();
		user.setUserId(id);
		userDAO.delete(user);
	}

	public void display() {
		System.out.println("user list");
		List<User> userList = userDAO.display();
		userList.forEach(user -> System.out.println(user));
	}

}