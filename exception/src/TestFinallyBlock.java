class TestFinallyBlock {
    public static void main(String args[]) {
        //with finally
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            //closing opertaion or clean up activites
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}  