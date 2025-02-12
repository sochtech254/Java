package org.sochtech.ooppart2compositionencapsulationandpolymorphism.codechallenge;

public class Bedroom
{
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(Lamp lamp, Bed bed, Ceiling ceiling, Wall wall4, Wall wall3, Wall wall2, Wall wall1,
                   String name)
    {
        this.lamp = lamp;
        this.bed = bed;
        this.ceiling = ceiling;
        this.wall4 = wall4;
        this.wall3 = wall3;
        this.wall2 = wall2;
        this.wall1 = wall1;
        this.name = name;
    }

    public Lamp getLamp()
    {
        return this.lamp;
    }

    public void makeBed()
    {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
