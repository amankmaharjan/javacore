package entity;


abstract public class Bird {
    private int eggs;
    private int wings;
    private double weight;
    private boolean vertebrate;

    public Bird() {
    }

    public Bird(int eggs, int wings, double weight, boolean vertebrate) {
        this.eggs = eggs;
        this.wings = wings;
        this.weight = weight;
        this.vertebrate = vertebrate;
    }

    abstract public void walk();

//    @Override
//    public String toString() {
//        return "Bird{" +
//                "eggs=" + eggs +
//                ", wings=" + wings +
//                ", weight=" + weight +
//                ", vertebrate=" + vertebrate +
//                '}';
//    }
}
