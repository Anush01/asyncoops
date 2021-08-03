package com.example.anushmp.lib;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hdfcMumbaiBranch extends hdfcbank{

    public static void main(String[] args) {

        hdfcbank mumbaibranch = new hdfcbank();

        System.out.println("what do you want to do today? Enter 1 to deposit" +
                " Enter 2 to withdraw money, Enter 3 to show balance, Enter 4" +
                " to show account details. Thank you! ");

        int input = 4;

        if(input == 1){

            System.out.println("how much do you want to deposit?");

            int deposit = 100;

            System.out.println("Okay, thank you for depositing 100"
            + " Your old balance was " + mumbaibranch.getCustomerbalance().toString());

            Integer balance = mumbaibranch.getCustomerbalance();

            balance = balance + deposit;

            mumbaibranch.setCustomerbalance(balance);

            System.out.println("Your new balance is " + mumbaibranch.getCustomerbalance().toString());



        }

        if(input == 2){

            System.out.println("How much would you like to withdraw? "
            + "Your current balance is " + mumbaibranch.getCustomerbalance().toString());

            int withdraw = 20;

            System.out.println("thank you for withdrawing " + withdraw);

            Integer balance = mumbaibranch.getCustomerbalance();

            Integer newBal = balance - withdraw;

            mumbaibranch.setCustomerbalance(newBal);

            System.out.println("Your remaining balance is " + mumbaibranch.getCustomerbalance().toString());




        }

        if(input == 3){

            System.out.println("Your current balance is " + mumbaibranch.getCustomerbalance().toString());


        }

        if(input == 4){

            HashMap<String,String> info = mumbaibranch.getInfo();

            System.out.println("All your information is as follows. ");

            for(Map.Entry m : info.entrySet()){

                System.out.print(m.getKey().toString() + " is " + m.getValue().toString());
                System.out.println();

            }



        }

    }

}
