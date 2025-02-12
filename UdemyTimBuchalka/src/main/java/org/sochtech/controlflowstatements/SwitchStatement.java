package org.sochtech.controlflowstatements;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        int switchvalue = 3;

        switch (switchvalue)
        {
            case 1:
                System.out.println("The value was 1");
                break;
            case 2:
                System.out.println("The value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("The value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchvalue);
                break;
            default:
                System.out.println("The value was not 1 or 2");
        }

        char character = 'C';
        switch (character)
        {
            case 'A':
                System.out.println("Character A found!");
                break;
            case 'B':
                System.out.println("Character B found!");
                break;
            case 'C': case 'D' : case 'E' :
                System.out.println("Character " + character + " found!");
                break;

            default:
                System.out.println("Character not found!");
        }
    }
}
