package com.sjprograming;

import java.util.ArrayList;
import java.util.List;

public class AtmOperationImplements  implements AtmOperationInterface{
    ATM atm=new ATM();
    List<String> ministmt=new ArrayList<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.add(withdrawAmount+" Amount withdrawn");
                System.out.println("Collect the Cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient Balance!!");
            }
        }
        else{
            System.out.println("Please Enter the amount in multiple of 500");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        ministmt.add(depositAmount+" Amount Deposited.");
        System.out.println(depositAmount+" Deposited Successfully!!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        System.out.println("-----Mini Statement-----");
        for (String s:ministmt){
            System.out.println(s);
        }
    }
}
