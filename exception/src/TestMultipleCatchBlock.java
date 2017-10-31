public class TestMultipleCatchBlock {
    public static void main(String args[]) {
        //multiple catch
        try {
            int a[] = new int[5];
            int b = Integer.parseInt(args[0]);
            a[7] = 30 / b;
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed"+e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed" + e.toString());
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        finally {
            System.out.println("finally block");
        }

        System.out.println("rest of the code...");
    }
}  