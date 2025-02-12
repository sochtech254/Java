package org.sochtech.ooppart1classesconstructorsandinheritance.codingchallenges;

public class BankAccountMain
{
    public static void main(String[] args)
    {
        BankAccount bobsAccount = new BankAccount(870186040918L, 0.00,
                "Bob Brown", "myemail@bob.com", 254703165115L);

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getAccountBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        BankAccount timsAccount = new BankAccount("Tim", "tim@emaill.com",
                                      254765670706L);
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getAccountBalance());
        timsAccount.withdrawal(100.55);
    }
}
