package org.sochcode.Part1.ch08Inheritance;

// Dynamic Method Dispatch
class A4
{
    void callme()
    {
        System.out.println("Inside A4's callme method");
    }
}

class B4 extends A4
{
    // override callme()

    @Override
    void callme() {
        System.out.println("Inside B4's callme method");
    }
}

class C4 extends A4
{
    // override callme()

    @Override
    void callme() {
        System.out.println("Inside c4's callme method");
    }
}
class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        A4 a = new A4();    // object of type A4
        B4 b = new B4();    // object of type B4
        C4 c = new C4();    // object of type c4

        A4 r;    // obtain a reference of type A4

        r = a;    // r refers to an A4 object
        r.callme();    // calls A4's version of callme

        r = b;    // r refers to a B4 object
        r.callme();    // calls B4's version of callme

        r = c;    // r refers to a C4 object
        r.callme();    // calls C4's version of callme
    }
}
