package com.withWahib;

public class BankAcount extends Customer{
    private int iban ,balance;
    public BankAcount(int customerNo ,String accounts, String creditCards , int iban,int balance){
        super(customerNo,accounts,creditCards);
        this.balance=balance;
        this.iban=iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public int getIban() {
        return iban;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return (super.toString()+"BankAcount{" +
                "iban=" + iban +
                ", balance=" + balance +
                '}');
    }
}
