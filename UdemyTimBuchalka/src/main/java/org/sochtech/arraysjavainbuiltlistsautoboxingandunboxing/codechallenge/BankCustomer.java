package org.sochtech.arraysjavainbuiltlistsautoboxingandunboxing.codechallenge;

import java.util.ArrayList;

public class BankCustomer
{
    private final String name;
    private final ArrayList<Double> transactions;

    public BankCustomer(String name, double initialAmount)
    {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransactions(initialAmount);
    }

    public void addTransactions(double amount)
    {
        this.transactions.add(amount);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Double> getTransactions()
    {
        return transactions;
    }
}
