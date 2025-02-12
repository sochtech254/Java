package org.sochcode.Part1.ch17switchExpressionRecordsAndOtherTopics;

// Use a compact record constructor.

// Declare an employee record.
record Employees(String name, int idNum)
{
    // Use a compact canonical constructor to remove any leading and
    // trailing spaces from the name string.
    public Employees
    {
        // Remove any leading and trailing spaces.
        name = name.trim();
    }
}

class CompactRecordConstructorDemo
{
    public static void main(String[] args)
    {
        Employees[] empList = new Employees[4];

        // Here, the name has no leading or trailing spaces.
        empList[0] = new Employees("Doe, John", 1047);

        // The next three names have leading and/or trailing spaces.
        empList[1] = new Employees("    Jones, Robert", 1048);
        empList[2] = new Employees("Smith, Rachel    ", 1049);
        empList[3] = new Employees("  Martin, Dave  ", 1050);

        // Use the record accessors to display names amd IDs.
        // Notice that all leading and/or trailing spaces have been
        // removed from the name component by the constructor.
        for (Employees e : empList)
            System.out.println("The employee ID for " + e.name() + " is " + e.idNum());
    }
}
