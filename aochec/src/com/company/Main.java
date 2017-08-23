package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.List;

public class Main {

    public static int goalz;
    public static boolean lifeVacation;
    public static int noOfPeopleThatWantRetirement;
    public static String name;
    public static List<People> people;

    public static void main(String[] args) {
	// Bygg den recursivt den där den räknar år för år - when interestBearingCapital = goalz lifeVacation is true
        setUpConditions();

        //Bygg rekursiv grej

    }

    public static void assetCount(){
        if(lifeVacation){
            System.out.println("sweet");
        }
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
            if(workOrNot() == JOptionPane.YES_OPTION){
                workingConditions();
                continue;
            }
            nonWorkingConditions();
        }

    }

    public static int workOrNot(){
        return JOptionPane.showConfirmDialog(null,"Will they be freelancing?", "Please select", JOptionPane.YES_NO_OPTION);
    }

    public static void workingConditions(){
        People wp = new WorkingPerson();
        wp.setName(name);
        wp.setAge(age());
        wp.setAssets(seed());
        wp.setInvoiceAmount(income());
        wp.setFuturePayout(futurePayOut());
        people.add(wp);
    }

    public static void nonWorkingConditions(){
        People nwp = new NonWorkingPerson();
        nwp.setName(name);
        nwp.setAge(age());
        nwp.setFuturePayout(futurePayOut());
        people.add(nwp);
    }

    public static int age(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "How old are they?"));
    }

    public static int seed(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "What is your seed?"));

    }

    public static int income(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "How much do you invoice each month? (based on 11 months of working)"));
    }

    public static int futurePayOut(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "What do you want for future monthly payout?"));
    }

    /*
    public static int interest(){

    }

    public static int taxes(){

    }*/
}
