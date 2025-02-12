package org.sochtech.arraysjavainbuiltlistsautoboxingandunboxing.codechallenge;

public class BankBranchCustomerMain
{
    public static void main(String[] args)
    {
        Bank bank = new Bank("Kenya Commercial Bank");

        bank.addBranch("Ruiru");

        bank.addCustomer("Ruiru", "Tim", 50.05);
        bank.addCustomer("Ruiru", "Mike", 175.34);
        bank.addCustomer("Ruiru", "Percy", 220.12);

        bank.addBranch("Thika");
        bank.addCustomer("Thika", "Bob", 150.54);

        bank.addCustomerTransaction("Thika", "Tim", 44.22);
        bank.addCustomerTransaction("Thika", "Mike", 12.44);
        bank.addCustomerTransaction("Thika", "Mike", 1.65);

        bank.listCustomers("Ruiru", true);
        bank.listCustomers("Thika", true);
    }
}
