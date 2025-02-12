package org.sochtech.ooppart2compositionencapsulationandpolymorphism.encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "sword");
        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "
                            + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());
    }
}
