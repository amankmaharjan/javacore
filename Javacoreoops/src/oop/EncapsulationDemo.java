package oop;

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount absherzad = new BankAccount("20120", "Abdul Rahman Sherzad");
        absherzad.deposit(500);
        // Not possible because withdraw() check the withdraw amount with balance
        // Because current balance is 500 and less than withdraw amount is 1000
        absherzad.withdraw(1000); // Encapsulation Benefit
        // Not possible because class balance is private
        // and not accessible directly outside the BankAccount class
//        absherzad.balance = 120000; // Encapsulation Benefit
       // if authorized personnel is  only alloweed to deposit form specific bank branch,then encapsulation plays major
//        role in data hiding
    }
}