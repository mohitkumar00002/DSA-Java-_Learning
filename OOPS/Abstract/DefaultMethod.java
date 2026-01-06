package Abstract;

interface Vehicle {
    void start(); // abstract method

    // default method
    default void fuel() {
        System.out.println("Petrol or Diesel");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with kick");
    }

    // overriding default method
    @Override
    public void fuel() {
        System.out.println("Bike uses Petrol");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.fuel();  // uses default method from interface

        Vehicle bike = new Bike();
        bike.start();
        bike.fuel(); // overridden method from Bike class
    }
}
