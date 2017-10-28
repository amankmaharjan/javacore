package entity;

public class Parrot extends Bird implements Flyable {
    private boolean shortNeck;

    public Parrot() {
    }

    @Override
    public void walk() {
        System.out.println("parrot can walk");
    }

    public Parrot(int eggs, int wings, double weight, boolean vertebrate, boolean shortNeck) {
        super(eggs, wings, weight, vertebrate);
        this.shortNeck = shortNeck;
    }

    @Override
    public void fly() {
        System.out.println("parrot can fly");
    }

//    @Override
//    public String toString() {
//        return "Parrot{" +
//                "shortNeck=" + shortNeck +
//                '}';
//    }
}
