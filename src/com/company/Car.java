package com.company;

public class Car extends Vehicle {

    private String make;
    private String model;

    public Car(String make, String model, int numberOfWheels, String color) {
        super(color, numberOfWheels, true);
        this.make = make;
        this.model = model;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("this is a car of model " + model + " amd make of " + make);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
