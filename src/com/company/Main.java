package com.company;

public class Main {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Ford", "Bronco", 4, 5, "Yellow");
        Car car1 = new Car("Ford", "Mustang", 4, "Blue:");

        sedan1.printDetails();
        System.out.println("\n");
        car1.printDetails();

        Vehicle[] vehicleArray = new Vehicle[3];

        vehicleArray[0] = new Vehicle("Brown", 3, false);
        vehicleArray[1] = new Car("Ford", "Escape", 4, "red");
        vehicleArray[2] = new Sedan("Ford", "Taurus", 4, 5, "blue");

        for (int i = 0; i < vehicleArray.length; i++) {
            vehicleArray[i].printDetails();

        }
    }
}
