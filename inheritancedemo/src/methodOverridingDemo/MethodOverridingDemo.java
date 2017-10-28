package methodOverridingDemo;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bike bike = new Bike(); //static binding
        bike.run();

        Vehicle vehicle = new Bike();//dynamic binding
        vehicle.run();

        vehicle = new Vehicle();
        vehicle.run();

    }
}
