package org.sochtech.innerandabstractclassesandinterfaces.codechallenges;

public class MyLinkedListMain
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        // "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney"
        String[] data = stringData.split(" ");
        for (String s : data)
        {
            list.addItem(new NodeListItem(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new NodeListItem("3"));
        list.traverse(list.getRoot());

        list.removeItem(new NodeListItem("5"));
        list.traverse(list.getRoot());

        list.removeItem(new NodeListItem("0"));
        list.removeItem(new NodeListItem("4"));
        list.removeItem(new NodeListItem("2"));
        list.traverse(list.getRoot());

        list.removeItem(new NodeListItem("9"));
        list.traverse(list.getRoot());
        list.removeItem(new NodeListItem("8"));
        list.traverse(list.getRoot());
        list.removeItem(new NodeListItem("6"));
        list.traverse(list.getRoot());
        list.removeItem(new NodeListItem(list.getRoot()));
        list.traverse(list.getRoot());
        list.removeItem(new NodeListItem(list.getRoot()));
        list.traverse(list.getRoot());


    }
}
