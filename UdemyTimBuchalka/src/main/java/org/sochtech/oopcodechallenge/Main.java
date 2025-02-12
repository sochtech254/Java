package org.sochtech.oopcodechallenge;

public class Main
{
    public static void main(String[] args)
    {
        Hamburuger hamburuger = new Hamburuger("Basic", "sausage", 3.55, "white");
        double price = hamburuger.itemizeHamburger();
        hamburuger.addHamburugerAddition1("Tomato", 0.25);
        hamburuger.addHamburugerAddition2("Lettuce", 0.75);
        hamburuger.addHamburugerAddition3("Cheese", 1.15);
        System.out.println("Total Burger price is " + hamburuger.itemizeHamburger());

        System.out.println();
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.65);
        healthyBurger.addHamburugerAddition1("Egg", 5.45);
        healthyBurger.addHealthAddition1("Lentils", 3.45);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        System.out.println();
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburugerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}
