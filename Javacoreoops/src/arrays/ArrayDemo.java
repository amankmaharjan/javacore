package arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int x[] = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.print("num:"+i);
            x[i] = scanner.nextInt();
        }
        for (int i : x
                ) {
            System.out.print(i);
        }

    }
}
