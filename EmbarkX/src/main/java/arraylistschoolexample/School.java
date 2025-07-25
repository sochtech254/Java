package arraylistschoolexample;

import java.util.ArrayList;

public class School
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student s1 = new Student("Ram", 21);
        studentArrayList.add(s1);

        Student s2 = new Student("Ravi", 23);
        studentArrayList.add(s2);

        Student s3 = new Student("Sheela", 20);
        studentArrayList.add(s3);

        if (studentArrayList.remove(s1))
        {
            System.out.println("Ram has been removed");
        }

        studentArrayList.set(0, s1);

        for (Student s : studentArrayList)
        {
            System.out.println(s.getName() + " - " + s.getRollNumber());
        }

        studentArrayList.clear();
        if (studentArrayList.isEmpty())
        {
            System.out.println("School has shut down");
        }
    }
}
