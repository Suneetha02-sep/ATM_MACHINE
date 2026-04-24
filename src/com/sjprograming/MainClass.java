package com.sjprograming;


import java.sql.SQLOutput;
import java.util.*;
public class MainClass {
    public static void main(String [] args){
        AtmOperationInterface op=new AtmOperationImplements();
        int atmNumber=12345;
        int atmPin=123;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To ATM Machine!!");
        System.out.println("Enter Atm Number:");
        int atmnumber=sc.nextInt();
        System.out.println("Enter Pin:");
        int pin=sc.nextInt();
        if((atmNumber==atmnumber)&&(atmPin==pin)){
//            System.out.println("Validation Done");
            while(true){
                System.out.println("1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View MiniStatement\n 5.Exit");
                System.out.println("Enter Choice:");
                int ch=sc.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter WithdrawAmount:");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit:");
                    double depositAmt=sc.nextDouble();
                    op.depositAmount(depositAmt);
                }
                else if(ch==4){
                    op.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Collect Your ATM Card\n Thank You for using ATM Machine!");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter Correct Choice");
                }

            }
        }
        else{
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0);
        }

    }
}
