package org.sochtech.arraysjavainbuiltlistsautoboxingandunboxing.codechallenge;

import java.util.ArrayList;

public class MobilePhoneContactArrayList
{
    private final ArrayList<ContactArrayList> myContacts;

    public MobilePhoneContactArrayList(String myNumber)
    {
        this.myContacts = new ArrayList<ContactArrayList>();
    }

    public boolean addNewContact(ContactArrayList contactArrayList)
    {
        if (findContact(contactArrayList.getName()) >= 0)
        {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contactArrayList);
        return true;
    }

    public boolean updateContact(ContactArrayList oldContact, ContactArrayList newContact)
    {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0)
        {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1)
        {
            System.out.println("Contact with name " + newContact.getName() +
                               " already exists. Update was not successful.");
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(ContactArrayList contactArrayList)
    {
        int foundPosition = findContact(contactArrayList);
        if (foundPosition < 0)
        {
            System.out.println(contactArrayList.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contactArrayList.getName() + ", was deleted.");
        return true;
    }

    private int findContact(ContactArrayList contactArrayList)
    {
        return this.myContacts.indexOf(contactArrayList);
    }

    private int findContact(String contactName)
    {
        for (int i = 0; i < this.myContacts.size(); i++)
        {
            ContactArrayList contactArrayList = this.myContacts.get(i);
            if (contactArrayList.getName().equals(contactName))
            {
                return i;
            }
        }

        return -1;
    }

    public String queryContact(ContactArrayList contactArrayList)
    {
        if (findContact(contactArrayList) >= 0)
        {
            return contactArrayList.getName();
        }

        return null;
    }

    public ContactArrayList queryContact(String name)
    {
        int position = findContact(name);
        if (position >= 0)
        {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts()
    {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++)
        {
            System.out.println((i+1) + "." +
                               this.myContacts.get(i).getName() + " -> " +
                               this.myContacts.get(i).getPhoneNumber());
        }
    }
}
