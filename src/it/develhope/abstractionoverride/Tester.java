package it.develhope.abstractionoverride;

/**
 * Tester
 *
 * @author Tania Ielpo
 */

public class Tester {

    public static void main(String[] args) {
        Car myCar = new Car(4,3,5600);
        Boat myBoat= new Boat(37,520);


        //---------CAR-------------
        System.out.println("-------------------------------------");
        myCar.showVehicleDetails();
        myCar.doVehicleSound();
        System.out.println("-------------------------------------");

        //-------BOAT------------
        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();
        System.out.println("-------------------------------------");

        
        System.out.println(myBoat.getBoatWeightAndSpeed());

    }
}
