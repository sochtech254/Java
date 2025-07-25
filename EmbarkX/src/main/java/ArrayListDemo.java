import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(1, "B");

        for (String a : arrayList)
        {
            System.out.println(a);
        }

        int x = arrayList.indexOf("A");
        System.out.println("Index: " + x);

        System.out.println("Remove a : " + arrayList.remove("A"));

        arrayList.clear();
        if (arrayList.isEmpty())
        {
            System.out.println("ArrayList is empty.");
        }
    }
}
