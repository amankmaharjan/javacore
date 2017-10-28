package entity;

public class A {
    int a;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }

//    public String display() {
//        return "A{" +
//                "a=" + a +
//                '}';
//    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }
}
