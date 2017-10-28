package entity;

public class B extends A {
    int b;

    public B() {
    }

    public B(int b ,int a) {
        super(a);
        this.b = b;

    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", a=" + a +
                '}';
    }
}
