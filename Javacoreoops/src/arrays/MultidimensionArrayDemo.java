package arrays;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class MultidimensionArrayDemo {
    public static void main(String[] args) {
        int row, column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter row:");
        row = scanner.nextInt();
        System.out.println("enter column:");
        column = scanner.nextInt();

        int[][] a = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(i + "," + j + ":");
                a[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        System.out.println("oupput matrix");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (int[]i : a) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
