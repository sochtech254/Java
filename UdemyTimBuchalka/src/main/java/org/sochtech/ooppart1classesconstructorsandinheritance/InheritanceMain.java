package org.sochtech.ooppart1classesconstructorsandinheritance;

public class InheritanceMain
{
    public static void main(String[] args)
    {
        InheritanceAnimal animal = new InheritanceAnimal("Animal", 1, 1, 5, 5);
        InheritanceDog dog = new InheritanceDog("Yorkie", 8, 20, 2, 4, 1,
                                               20, "long silky");

        dog.eat();
        dog.walk();
        dog.run();
    }
}
