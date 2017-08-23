package com.company;

/**
 * Created by adam.sahlstrom on 2017-08-23.
 */
public class People {

    private String name;
    private int age;
    private int invoiceAmount;

    public People(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(int invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }


    void print(){
        System.out.println("This food is great");
    }
}
