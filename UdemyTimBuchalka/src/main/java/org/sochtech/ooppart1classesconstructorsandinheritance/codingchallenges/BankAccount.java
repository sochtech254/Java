package org.sochtech.ooppart1classesconstructorsandinheritance.codingchallenges;

public class BankAccount
{
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private long phoneNumber;

    public BankAccount()
    {
        System.out.println("Empty constructor called.");
    }

    public BankAccount(long accountNumber, double accountBalance, String customerName,
                       String customerEmail, long phoneNumber)
    {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, long phoneNumber) {
        this(8765453736L,100.55,customerName, customerEmail, phoneNumber);
    }

    public void deposit(double depositAmount)
    {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount)
    {
        if ((this.accountBalance - withdrawalAmount) < 0) {
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not processed");
        }
        else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = "
                                 + this.accountBalance);
        }
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}
