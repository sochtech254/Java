package org.sochcode.telusko.collectionsframework.stack.fixedstack;

public class Runner
{
    public static void main(String[] args)
    {
        Stack nums = new Stack();
        System.out.println("Empty :" + nums.isEmpty());
        nums.push(87);
        nums.push(10);
        System.out.println(nums.peek());

        nums.push(15);

        System.out.println("size is " + nums.size());

        System.out.println(nums.pop());

        System.out.println("Empty :" + nums.isEmpty());

        nums.show();
    }
}
