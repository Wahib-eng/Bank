package com.withWahib;

public class Customer extends Person{
    private int customerNo;
    private String accounts, creditCards;


    public Customer(String name,String surname,String email,int phoneNO, String accounts, String creditCards) {
        super(name,surname,email,phoneNO);
        this.accounts=accounts;
        this.creditCards=creditCards;
        this.customerNo=customerNo;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }
    public int getCustomerNo() {
        return customerNo;
    }
    @Override
    public String toString() {
        return (super.toString()+"Customer{" +
                "customerNo=" + customerNo +
                ", accounts='" + accounts + '\'' +
                ", creditCards='" + creditCards + '\'' +
                '}');
    }
}
