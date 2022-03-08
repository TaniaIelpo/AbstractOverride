package it.develhope.abstractionoverride;

/**
 * This class represent a car
 *
 * @author Tania Ielpo
 */

public class Car extends Vehicle{

    public int numberOfDoors;
    public double carPrice;

    public Car(int wheels, int doors, double price){
        super.type="CAR";
        super.numberOfWheels=wheels;
        this.numberOfDoors=doors;
        //price of a car in euros
        this.carPrice=price;

    }

    /**
     * This method prints the car details
     */

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("It has: "+this.numberOfDoors+" doors");
    }

    /**
     * This method prints the car Sound
     */

    @Override
    void doVehicleSound() {
        System.out.println("The car makes BRUM");

    }
}
