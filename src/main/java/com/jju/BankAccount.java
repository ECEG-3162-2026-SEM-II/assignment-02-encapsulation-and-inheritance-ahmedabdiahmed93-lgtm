package com.jju;


public class BankAccount {
    protected double balance; // Protected so subclasses can see it, but not the public

    public BankAccount(String accountHolder) {
    }

    public void deposit(double amount) {
        // Student Task: Implement deposit logic with validation
    }

    public void withdraw(double amount) {
        // Student Task: Implement withdrawal logic (prevent overdraft)
    }

    public double getBalance() {
        return balance;
    }
}
