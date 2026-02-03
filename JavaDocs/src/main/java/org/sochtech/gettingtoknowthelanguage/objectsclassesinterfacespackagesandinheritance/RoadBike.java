package org.sochtech.gettingtoknowthelanguage.objectsclassesinterfacespackagesandinheritance;

public class RoadBike extends Bicycle {
    boolean RideOnRoad = true;

    public RoadBike(int cadence, int speed, int gear, boolean rideOnRoad) {
        super(cadence, speed, gear);
        RideOnRoad = rideOnRoad;
    }
}
