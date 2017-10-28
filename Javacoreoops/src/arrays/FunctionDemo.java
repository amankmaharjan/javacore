package arrays;

public class FunctionDemo {
    public static void main(String[] args) {
        int num1 = 4, num2 = 2;
        add(num1, num2);
        mul(num1, num2);
        int substraction = sub(num1, num2);
        System.out.println("sub=" + substraction);
        int division = div(num1, num2);
        System.out.println("division=" + division);

    }

    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("add=" + result);
    }

    public static int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static void mul(int num1, int num2) {
        int result = num1 *num2;
        System.out.println("mul=" + result);
    }

    public static int div(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
