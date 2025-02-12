package org.sochcode.telusko.collectionsframework.linkedList;

public class Runner
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(18);
        list.insert(45);
        list.insert(12);

        list.insertAtStart(25);

        list.inssertAt(2, 56);

        list.deleteAt(4);

        list.show();
    }
}
