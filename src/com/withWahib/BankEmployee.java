package com.withWahib;

public class BankEmployee extends Person{
    private String employeeId;
    private String customers;

    BankEmployee(String name,String surname,String email, int phoneNO,String employeeId,String customers){
        super(name,surname,email,phoneNO);
        this.employeeId=employeeId;
        this.customers=customers;

    }
    public void setEmployeeId(String employeeId){
        this.employeeId=employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return (super.toString()+"BankEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", customers='" + customers + '\'' +
                '}');
    }
}
