package org.sochtech.innerandabstractclassesandinterfaces;

public class AnimalClassMain
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird bird = new Parrot("Australian ringneck");
        bird.breathe();
        bird.eat();
        bird.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
