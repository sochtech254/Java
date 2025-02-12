package org.sochcode.amigoscode;

public class MethodDemo
{
    // A method is a block of code which runs only when it is invoked

    /*
    *  - Access Modifier (public, private, protected)
    *  - Static or non-static
    *  - Return type or void
    *  - Name
    *  - Optional Parameters
    *  - Method Body
    *  - Optional Return value
    * */

    private static int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public static void main(String[] args)
    {
        int result = add(7, 5);
        System.out.println(result);
    }
}
