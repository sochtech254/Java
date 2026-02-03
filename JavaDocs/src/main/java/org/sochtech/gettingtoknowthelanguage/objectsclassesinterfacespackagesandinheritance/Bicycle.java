package org.sochtech.gettingtoknowthelanguage.objectsclassesinterfacespackagesandinheritance;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        IO.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
