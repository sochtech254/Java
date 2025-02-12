package org.sochtech.arraysjavainbuiltlistsautoboxingandunboxing.codechallenge;

import java.util.ArrayList;

public class Bank
{
    private final ArrayList<BankBranch> branches;

    public Bank(String name)
    {
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName)
    {
        if (findBranch(branchName) == null)
        {
            this.branches.add(new BankBranch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount)
    {
        BankBranch bankBranch = findBranch(branchName);
        if (bankBranch != null)
        {
            return bankBranch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount)
    {
        BankBranch bankBranch = findBranch(branchName);
        if (bankBranch != null)
        {
            return bankBranch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private BankBranch findBranch(String branchName)
    {
        for (BankBranch checkedBranch : this.branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction)
    {
        BankBranch bankBranch = findBranch(branchName);
        if (bankBranch != null)
        {
            System.out.println("Customer details for branch " + bankBranch.getName());

            ArrayList<BankCustomer> branchCustomers = bankBranch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++)
            {
                BankCustomer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + i + "]");
                if (showTransaction)
                {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++)
                    {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else
        {
            return false;
        }
    }
}
