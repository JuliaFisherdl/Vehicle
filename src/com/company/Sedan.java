package com.company;

public class Sedan extends Car {
    private int numberOfSeats;

    public Sedan(String make, String model, int numberOfWheels, int numberOfSeats, String color) {
        super(make,model, numberOfWheels, color);
        this.numberOfSeats = numberOfSeats;

    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("This is a sedan with " + numberOfSeats + " sgiteats");
    }


}
