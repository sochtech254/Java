package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Demonstrate reflection.
import java.lang.reflect.*;

class JavaReflectionCapabilities
{
    public static void main(String[] args)
    {
        try
        {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Constructors:");
            Constructor<?>[] constructors = c.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(" " + constructor);
            }

            System.out.println("Fields:");
            Field[] fields = c.getFields();
            for (Field field : fields) {
                System.out.println(" " + field);
            }

            System.out.println("Methods:");
            Method[] methods = c.getMethods();
            for (Method method : methods) {
                System.out.println(" " + method);
            }
        } catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
