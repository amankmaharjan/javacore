package arrays;

import java.util.Scanner;

public class DoWhileMenu {
    public static void main(String[] args) {
        String[] users = null;
        Scanner scanner = new Scanner(System.in);
        String ok;
        System.out.println("please choose the menu");
        do {
            System.out.println("1.Insert user");
            System.out.println("2.Update user");
            System.out.println("3.Delete user");
            System.out.println("4.Display userList");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("insert:");
                    users = insert();
                    break;
                case 2:
                    System.out.println("update:");
                    update(users);
                    break;
                case 3:
                    System.out.println("delete:");
                    delete(users);
                    break;
                case 4:
                    System.out.println("display:");
                    display(users);
                    break;

                default:
                    System.out.println(" invalid input:");
            }
            System.out.println("do you want to continue?yes or no");
            ok = scanner.next();
        }
        while (ok.equals("yes"));
        System.exit(0);
    }

    //insert
    public static String[] insert() {
        System.out.println("Enter user size:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] users = new String[size];
        for (int i = 0; i < users.length; i++) {
            System.out.printf("user" + i + ":");
            users[i] = sc.next();
        }
        return users;
    }
    //update
    public static void update(String[] users) {
        System.out.println("enter user index to update:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.print("update value:");
        String value = sc.next();
        users[index] = value;
        System.out.println("user updated");
    }
    //delete
    public static void delete(String[] users) {
        System.out.println("enter user index to delete:");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        users[index] = null;
    }
    //display
    public static void display(String[] users) {
        for (int i = 0; i < users.length; i++) {
            System.out.println(i + "." + users[i]);
        }
    }


}
