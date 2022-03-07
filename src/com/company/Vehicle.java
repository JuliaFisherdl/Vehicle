package com.company;

public class Vehicle {
    private String color;
    private int numberOfWheels;
    private boolean hasMotor;

    public Vehicle(String color, int numberOfWheels, boolean hasMotor) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.hasMotor = hasMotor;
    }

    public void printDetails() {
        System.out.println("This is a vehicle with " + numberOfWheels + " wheels and is the color of " + color + ".");

    }

    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isHasMotor() {
        return hasMotor;
    }

    public void setHasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;

    }
}

