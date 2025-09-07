package com.example;

/**
 * A Car is an engine-powered vehicle so it will extends EPV.
 */
public class Car extends EnginePoweredVehicle {
    private final String model;

    public Car(String model, String fuelType, int seats) {
        super(fuelType, seats); 
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " engine starts with a roar!");
    }

    @Override
    public void stop() {
        System.out.println(model + " engine shuts down.");
    }

    public void honk() {
        System.out.println(model + " honks: Beep beep!");
    }
}
