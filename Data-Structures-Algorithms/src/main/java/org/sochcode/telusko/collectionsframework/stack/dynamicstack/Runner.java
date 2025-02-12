package org.sochcode.telusko.collectionsframework.stack.dynamicstack;

public class Runner
{
    public static void main(String[] args)
    {
        DynamicStack nums = new DynamicStack();
        System.out.println("Empty :" + nums.isEmpty());

        nums.push(87);
        nums.show();
        nums.push(10);
        nums.show();
        System.out.println(nums.peek());
        nums.push(15);
        nums.show();
        nums.push(45);
        nums.show();
        nums.push(12);
        nums.show();

        System.out.println("size is " + nums.size());

        System.out.println("Empty :" + nums.isEmpty());

        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
    }
}
