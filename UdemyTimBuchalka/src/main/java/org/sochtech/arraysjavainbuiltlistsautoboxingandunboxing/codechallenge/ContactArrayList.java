package org.sochtech.arraysjavainbuiltlistsautoboxingandunboxing.codechallenge;

public class ContactArrayList
{
    private final String name;
    private final String phoneNumber;

    public ContactArrayList(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public static ContactArrayList createContact(String name, String phoneNumber)
    {
        return new ContactArrayList(name, phoneNumber);
    }
}
