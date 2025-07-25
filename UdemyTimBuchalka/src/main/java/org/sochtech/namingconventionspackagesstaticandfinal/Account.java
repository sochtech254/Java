package org.sochtech.namingconventionspackagesstaticandfinal;

import java.util.ArrayList;

public class Account
{
    private final String accountName;
    private int accountBalance = 0;
    private final ArrayList<Integer> transactions;

    public Account(String accountName)
    {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getAccountBalance()
    {
        return accountBalance;
    }

    public void deposit(int amount)
    {
        if (amount > 0)
        {
            transactions.add(amount);
            this.accountBalance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.accountBalance);
        } else
        {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount)
    {
        int withdrawal =- amount;
        if (withdrawal < 0)
        {
            this.transactions.add(withdrawal);
            this.accountBalance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.accountBalance);
        } else
        {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance()
    {
        this.accountBalance = 0;
        for (int i : this.transactions)
        {
            this.accountBalance += i;
        }
        System.out.println("Calculated blance is " + this.accountBalance);
    }
}
