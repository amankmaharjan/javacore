import entity.*;
import entity.Runnable;


public class Main {
    public static void main(String[] args) {
        Bird bird;
        bird= new Ostrich(2, 2, 50, true, true);

        System.out.println(bird.toString());
        bird.walk();

        Runnable runnable=(Ostrich)bird;
        runnable.run();


        bird = new Parrot(2, 2, 10, true, true);
        System.out.println(bird.toString());
        bird.walk();
        Parrot p=(Parrot)bird;
        p.fly();



//        B b=new B(1,2);
//        System.out.println( b.display());
//        System.out.println(b.toString());
//        A a=new A(2);
//        System.out.println(a);
    }
}

