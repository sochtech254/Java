package org.sochtech.ooppart2compositionencapsulationandpolymorphism.codechallenge;

public class Car
{
    private final int cylinders;
    private final String name;

    public Car(int cylinders, String name)
    {
        this.cylinders = cylinders;
        this.name = name;
        int wheels = 4;
        boolean engine = true;
    }

    public int getCylinders()
    {
        return cylinders;
    }

    public String getName()
    {
        return name;
    }

    public String startEngine()
    {
        return "Car -> startEngine()";
    }

    public String accelerate()
    {
        return "Car -> accelerate()";
    }

    public String brake()
    {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car
{
    public Mitsubishi(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake()
    {
        return "Mitsubishi -> brake()";
    }
}

class Ford extends Car
{
    public Ford(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate()
    {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake()
    {
        return "Ford -> brake()";
    }
}

class Holden extends Car
{
    public Holden(int cylinders, String name)
    {
        super(cylinders, name);
    }

    @Override
    public String startEngine()
    {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate()
    {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake()
    {
        return getClass().getSimpleName() + " -> brake()";
    }
}
