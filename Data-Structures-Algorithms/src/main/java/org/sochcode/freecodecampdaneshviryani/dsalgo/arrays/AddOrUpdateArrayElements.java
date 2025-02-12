package org.sochcode.freecodecampdaneshviryani.dsalgo.arrays;

public class AddOrUpdateArrayElements
{
    public void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void arrayDemo()
    {
        int[] myArray = new int[5];    // default values
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;    // update index 2 with value 9
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length-1]);
    }

    public static void main(String[] args)
    {
        AddOrUpdateArrayElements addOrUpdateArrayElements = new AddOrUpdateArrayElements();
        addOrUpdateArrayElements.arrayDemo();
    }
}
