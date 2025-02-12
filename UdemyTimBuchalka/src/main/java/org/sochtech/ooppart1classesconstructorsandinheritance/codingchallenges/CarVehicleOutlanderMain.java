package org.sochtech.ooppart1classesconstructorsandinheritance.codingchallenges;

public class CarVehicleOutlanderMain
{
    public static void main(String[] args)
    {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
