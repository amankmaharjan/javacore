/**
 * Created by aman on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {

        PrimeThread primeThread = new PrimeThread();
        primeThread.start();


        PrimeRun primeRun = new PrimeRun();
        new Thread(primeRun).start();
    }

}
