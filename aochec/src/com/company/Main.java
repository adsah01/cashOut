package com.company;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static int goalz = 12000000;
    public static boolean lifeVacation;
    public static int noOfPeopleThatWantVacation;
    public static HashMap<String, Integer> people;

    public static void main(String[] args) {
	// Bygg den recursivt den där den räknar år för år - when interestBearingCapital = goalz lifeVacation is true
        setUpConditions();
        assetCount();
        System.out.println("hello world vacation");
    }

    public static void setUpConditions(){
        groupConditions();
        individualConditions();
    }

    public static void groupConditions(){
        noOfPeopleThatWantVacation = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people want this vacation?"));
    }


    public static void individualConditions(){
        System.out.println(noOfPeopleThatWantVacation);
        for(int i = 0; i < noOfPeopleThatWantVacation; i++){
            people.put("kalle", 2);
            System.out.println(i);
        }
    }

    public static String getUserName(){
        return JOptionPane.showInputDialog(null, "What is the first persons name?");
    }

    public static int getUserInvoiceAmount(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "How much will they invoice each months?"));
    }

    public static void assetCount(){
        if(lifeVacation){
            System.out.println("sweet");
        }
    }

    /*public static int income(){

    }

    public static int futurePayOut(){

    }

    public static int interest(){

    }

    public static int taxes(){

    }*/
}
