package org.sochtech.innerandabstractclassesandinterfaces;

public abstract class AbstractAnimalClass
{
    private final String name;

    public AbstractAnimalClass(String name)
    {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName()
    {
        return name;
    }
}
