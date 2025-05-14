package ex_05_ifelse;

import java.util.Scanner;

public class Lab32_if_else_p3 {
    public static void main(String[] args) {
        //A bank ATM only allows withdrawals if the user has enough balance.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Balance Amount");
        double balance = scanner.nextDouble();

        if(balance<=0){
            System.out.println("Insufficient Balance");
        }
        System.out.println("Enter Amount");


    }





}
