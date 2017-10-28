package oop;

public class BankAccount {
    // BankAccount attributes
    private String accountNumber;
    private String accountName;
    private double balance;

    // BankAccount methods
// the constructor
    public BankAccount(String accNumber, String accName) {
        accountNumber = accNumber;
        accountName = accName;
        balance = 0;
    }

    // methods to deposit and withdraw money
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }
}