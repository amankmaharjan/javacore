public class Testtrycatch2 {
    public static void main(String args[]) {
        //with try-catch
        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e+"divide by zero");
    }
        System.out.println("rest of the code...");
    }
}