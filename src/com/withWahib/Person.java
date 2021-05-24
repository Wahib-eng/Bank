package com.withWahib;

public class Person {
    private String name ;
    private String surname ;
    private String email ;
    int phoneNO;
    Person(String name , String surname , String email, int phoneNO){
       this.name=name;
       this.surname=surname;
       this.email=email;
       this.phoneNO=phoneNO;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setPhoneNO(int phoneNO){
        this.phoneNO=phoneNO;
    }
    public String getPhoneNO() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNO=" + phoneNO +
                '}';
    }
}
