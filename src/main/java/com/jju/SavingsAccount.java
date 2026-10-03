package com.jju;

public class SavingsAccount extends BankAccount {
    private double interestRate; // e.g., 0.05 for 5%

    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        // Student Task: Implement interest application logic
        double interest = getBalance() * interestRate;
        super.deposit(interest); 
    }

    public double getInterestRate() {
        return interestRate;
    }   
    
}
