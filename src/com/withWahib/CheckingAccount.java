package com.withWahib;


public  class CheckingAccount extends BankAccount{
    private String accountType;
    private static double FEE = 1.5;

    public CheckingAccount(double fee,int accountNumber){
        super(accountNumber);
    }
    public CheckingAccount(int accountNumber, double fee) {
        super(accountNumber);
        FEE = fee;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void CheckingAccount(double balance){

    }
    public void transferMoney(){

    }
    public void payCreditCardDept(){

    }

    @Override
    public void deposit(double amount) {
        if( amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);

            // Apply Transaction Fee
            balance -= FEE;
            System.out.printf("Fee %.2f Applied%n", FEE);
            System.out.printf("Current Balance is: %.2f%n", balance);

        } else {
            System.out.println("A negative amount cannot be deposited");
        }

    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0) {
            // Check sufficient balance
            if((amount+FEE) <= balance) {

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                balance -= FEE;
                System.out.printf("Fee of %.2f applied%n", FEE);
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }


}
