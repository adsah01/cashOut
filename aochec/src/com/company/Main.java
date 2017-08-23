package com.company;

import javax.swing.*;

public class Main {

    public static int goalz = 12000000;
    public static int capital;
    public static boolean lifeVacation;
    public static int noOfPeopleThatWantRetirement;
    public static boolean typeOfPerson;
    public static String name;

    public static void main(String[] args) {
	// Bygg den recursivt den där den räknar år för år - when interestBearingCapital = goalz lifeVacation is true
        People rp =new NonWorkingPerson();
        People rpa =new WorkingPerson();
        setUpConditions();

        //Bygg rekursiv grej

    }

    public static void setUpConditions(){
        groupConditions();
        individualConditions();
    }

    public static void groupConditions(){
        noOfPeopleThatWantRetirement = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people want this vacation?"));
    }


    public static void individualConditions(){
        for(int i = 0; i < noOfPeopleThatWantRetirement; i++){
            name = JOptionPane.showInputDialog(null, "What is the " + (i+1) + " persons name?");
            int j = JOptionPane.showConfirmDialog(null,
                    "Will they be freelancing?", "Please select",
                    JOptionPane.YES_NO_OPTION);
            if(j == JOptionPane.YES_OPTION){
                workingConditions();
                continue;
            }
            nonWorkingConditions();
        }

    }

    public static void workingConditions(){
        People wp = new WorkingPerson();
        wp.setName(name);
        wp.setAge(age());
        wp.setInvoiceAmount(income());
    }

    public static void nonWorkingConditions(){

    }

    public static void assetCount(){
        if(lifeVacation){
            System.out.println("sweet");
        }
    }


    public static int income(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "How much do you invoice each month? (based on 11 months of working)"));
    }

    public static int age(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "How old are they?"));
    }

    /*
    public static int futurePayOut(){

    }

    public static int interest(){

    }

    public static int taxes(){

    }*/
}
