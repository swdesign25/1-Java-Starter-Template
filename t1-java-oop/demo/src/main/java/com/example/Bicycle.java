package com.example;;

/**
 * A bicycle is a Vehicle but not engine-powered so it i plements vehicle.
 */
public class Bicycle implements Vehicle {
    private final int gears;

    public Bicycle(int gears) {
        this.gears = gears;
    }

    @Override
    public void start() {
        System.out.println("Pedaling the bicycle to start moving.");
    }

    @Override
    public void stop() {
        System.out.println("Braking to stop the bicycle.");
    }

    @Override
    public int capacity() {
        return 1; // cuz only one rider or maybe 2 with a child seat
    }

    public void ringBell() {
        System.out.println("Ring ring!");
    }

    public int getGears() {
        return gears;
    }
}
