package org.sochtech.oopcodechallenge;

public class DeluxeBurger extends Hamburuger
{
    public DeluxeBurger()
    {
        super("Deluxe", "Sausage & Bacon", 14.55, "White");
        super.addHamburugerAddition1("Chips", 2.75);
        super.addHamburugerAddition2("Drink", 1.85);
    }

    @Override
    public void addHamburugerAddition1(String name, double price)
    {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburugerAddition2(String name, double price)
    {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburugerAddition3(String name, double price)
    {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburugerAddition4(String name, double price)
    {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
