package com.jju;

public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(String accountHolder , double initialBalance) {
        super(accountHolder, initialBalance);
    }
    

    @Override
    public void withdraw(double amount) {
       // 2. Student Task: Implement withdraw logic here
        double totalAmount = amount + TRANSACTION_FEE;
        if (amount > 0 && balance >= totalAmount) {
            super.withdraw(totalAmount);
        }
    }

    
}

