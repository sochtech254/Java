package org.sochtech.innerandabstractclassesandinterfaces;

public abstract class Bird extends AbstractAnimalClass implements CanFly
{
    public Bird(String name)
    {
        super(name);
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe()
    {
        System.out.println("Breathe in, breathe out, repeat");
    }

    public void fly()
    {
        System.out.println(getName() + " is flapping its wings");
    }
}
