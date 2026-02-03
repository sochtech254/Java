package org.sochtech.gettingtoknowthelanguage.objectsclassesinterfacespackagesandinheritance;

public class MountainBike extends Bicycle {
    boolean BikeOnHillsAndValleys = true;

    public MountainBike(boolean bikeOnHillsAndValleys, int cadence, int speed, int gear) {
        super(cadence, speed, gear);
        BikeOnHillsAndValleys = bikeOnHillsAndValleys;
    }
}
