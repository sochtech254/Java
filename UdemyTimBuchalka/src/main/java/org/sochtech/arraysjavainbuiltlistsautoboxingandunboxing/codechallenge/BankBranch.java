package org.sochtech.arraysjavainbuiltlistsautoboxingandunboxing.codechallenge;

import java.util.ArrayList;

public class BankBranch
{
    private final String name;
    private final ArrayList<BankCustomer> customers;

    public BankBranch(String name)
    {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<BankCustomer> getCustomers()
    {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount)
    {
        if (findCustomer(customerName) == null)
        {
            this.customers.add(new BankCustomer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount)
    {
        BankCustomer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null)
        {
            existingCustomer.addTransactions(amount);
            return true;
        }

        return false;
    }

    private BankCustomer findCustomer(String customerName)
    {
        for (BankCustomer checkedCustomer : this.customers) {
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
