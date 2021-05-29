package com.withWahib;

public class SavingAccounts extends BankAccount{
    private String accountType;
    private static double interestRate = 1.5;

    public SavingAccounts(double interestRate,int accountNumber){
        super(accountNumber);
    }
    public SavingAccounts(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate=interestRate;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }
    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }

    @Override
    public void deposit(double amount) {
        if( amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);

            // Apply Transaction Fee
            System.out.printf("Current Balance is: %.2f%n", balance);

        } else {
            System.out.println("A negative amount cannot be deposited");
        }

    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0) {
            // Check sufficient balance
            if((amount+interestRate) <= balance) {

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"SavingAccounts{" +
                "accountType='" + accountType + '\'' +
                '}';
    }
}