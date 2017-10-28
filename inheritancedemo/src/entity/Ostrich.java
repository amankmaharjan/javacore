package entity;

public class Ostrich extends Bird implements Runnable {
    private boolean longNeck;

    public Ostrich() {
    }

    @Override
    public void walk() {
        System.out.println("Ostrich can walk");
    }

    public Ostrich(boolean longNeck) {
        this.longNeck = longNeck;
    }

    public Ostrich(int eggs, int wings, double weight, boolean vertebrate, boolean longNeck) {
        super(eggs, wings, weight, vertebrate);
        this.longNeck = longNeck;
    }

    @Override
    public void run() {
        System.out.println("ostcan run");
    }

//    @Override
//    public String toString() {
//        return "Ostrich{" +
//                "longNeck=" + longNeck +
//                '}';
//    }
}
