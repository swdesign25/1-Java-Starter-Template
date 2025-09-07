package com.example;

/**
 * Abstract class: EnginePoweredVehicle (EPV) implements Vehicle
 * This class will provides common properties and methods for all engine-powered vehicles.
 */
public abstract class EnginePoweredVehicle implements Vehicle {
    protected final String fuelType;
    protected final int seats;

    public EnginePoweredVehicle(String fuelType, int seats) {
        this.fuelType = fuelType;
        this.seats = seats;
    }

    @Override
    public int capacity() {
        return seats;
    }

    public void refuel() {
        System.out.println("Refueling with " + fuelType);
    }

    // subclasses MUST define how they start and stop.
    @Override
    public abstract void start();

    @Override
    public abstract void stop();
}
