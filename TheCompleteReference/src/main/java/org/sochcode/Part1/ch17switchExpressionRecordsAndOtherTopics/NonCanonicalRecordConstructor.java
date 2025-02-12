package org.sochcode.Part1.ch17switchExpressionRecordsAndOtherTopics;

// Use a non-canonical constructor in a record.

// Declare an employee record that explicitly declares both
// a canonical and non-canonical constructor.
record Employed(String name, int idNum)
{
    // Use a static field in a record.
    static int pendingID = -1;

    // Use a compact canonical constructor to remove any leading and
    // trailing spaces from the name string.
    public Employed
    {
        // Remove any leading and trailing spaces.
        name = name.trim();
    }

    // This is a non-canonical constructor. Notice that it is
    // not passed an ID number. Instead, it passes pendingID to the
    // canonical constructor to create the record.
    public Employed(String name)
    {
        this(name, pendingID);
    }
}

class NonCanonicalRecordConstructor
{
    public static void main(String[] args)
    {
        Employed[] empList = new Employed[4];

        // Create a list of employees that uses the Employee record.
        empList[0] = new Employed("Doe, John", 1047);
        empList[1] = new Employed("Jones, Robert", 1048);
        empList[2] = new Employed("Smith, Rachel", 1049);

        // Here, the ID number is pending.
        empList[3] = new Employed("Martin, Dave");

        // Display names and IDs.
        for (Employed e : empList)
        {
            System.out.print("The employee ID for " + e.name() + " is ");
            if (e.idNum() == Employed.pendingID) System.out.println("Pending");
            else System.out.println(e.idNum());
        }
    }
}
