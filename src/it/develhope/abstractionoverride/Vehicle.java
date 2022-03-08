package it.develhope.abstractionoverride;

/**
 * Abstract class that represent a Vehicle
 *
 * @author Tania Ielpo
 */

public abstract class Vehicle {

    public String type; //vehicle type
    public int numberOfWheels;

    /**
     * This method prints vehicle details
     */
    public void showVehicleDetails(){
        System.out.println("Type of vehicle: "+this.type+" and it has "+this.numberOfWheels+ " wheels");
    }

    abstract void doVehicleSound();

}
