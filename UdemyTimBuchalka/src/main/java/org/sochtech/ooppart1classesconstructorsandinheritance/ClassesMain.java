package org.sochtech.ooppart1classesconstructorsandinheritance;

public class ClassesMain
{
    public static void main(String[] args)
    {
        Classes porsche = new Classes();
        Classes holden = new Classes();

        porsche.setModel("Carrera");    // test with 911
        System.out.println("Model is " + porsche.getModel());
    }
}
