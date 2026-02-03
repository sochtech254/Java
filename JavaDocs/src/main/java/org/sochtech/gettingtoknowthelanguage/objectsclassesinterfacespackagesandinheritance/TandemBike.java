package org.sochtech.gettingtoknowthelanguage.objectsclassesinterfacespackagesandinheritance;

public class TandemBike extends Bicycle {
    boolean doubleSeatsAndHandlebars = true;

    public TandemBike(int cadence, int speed, int gear, boolean doubleSeatsAndHandlebars) {
        super(cadence, speed, gear);
        this.doubleSeatsAndHandlebars = doubleSeatsAndHandlebars;
    }
}
