package com.example;

public class App {
    public static void main(String[] args) {
        Vehicle bike = new Bicycle(6);
        bike.start();
        System.out.println("Bike capacity: " + bike.capacity());
        bike.stop();
        // Subclass-specific method
        ((Bicycle) bike).ringBell();
        System.out.println("Bike has " + ((Bicycle) bike).getGears() + " gears.");
        EnginePoweredVehicle car = new Car("Tesla Model 3", "Electric", 5);
        car.refuel();
        car.start();
        System.out.println("Car capacity: " + car.capacity());
        car.stop();
        
        ((Car) car).honk();
    }
}
