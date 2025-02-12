package org.sochcode.Part1.ch12enumerationsAutoboxingAndAnnotations;

class ExprMixNumObjAutoBoxAutoUnBox
{
    public static void main(String[] args)
    {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb after expression: " + dOb);
    }
}
