package it.develhope.abstractionoverride;

/**
 * This class represent a Boat
 *
 * @author Tania Ielpo
 */

public class Boat extends Vehicle{

    //Speed in km/h
    double maxKnotsSpeed;
    //Weight in kilos
    int boatKilosWeight;

    public Boat(double maxSpeed, int weight){
        super.type="BOAT";
        this.boatKilosWeight=weight;
        this.maxKnotsSpeed=maxSpeed;
    }

    /**
     * This method saves in a string weight and speed of boat
     * @return String with weight and speed
     */
    public String getBoatWeightAndSpeed(){
        return "The weight of boat is "+this.boatKilosWeight+" kilos and its maximum speed is "+this.maxKnotsSpeed+" knots.";
    }

    /**
     * this method prints the boat sound
     */
    @Override
    void doVehicleSound() {
        System.out.println("The boat makes VROOM");
    }
}
