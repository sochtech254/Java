package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Show public methods.
import java.lang.reflect.*;

class ReflectPublicMethodsOfAClass
{
    public static void main(String[] args)
    {
        try
        {
            A a = new A();
            Class<?> c = a.getClass();
            System.out.println("Public Methods:");
            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                int modifiers = method.getModifiers();
                if (Modifier.isPublic(modifiers)) {
                    System.out.println(" " + method.getName());
                }
            }
        } catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}

class A
{
    public void a1() {}
    public void a2() {}
    protected void a3() {}
    private void a4() {}
}