package Daily_Excercises;

import java.util.Scanner;

public class Exc_016 {
    public static void main(String[] args) {
        //ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
        //  Steps to Write the Program
        //1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
        //2️⃣ Take user input for the amount they want to withdraw.
        //3️⃣ Check withdrawal conditions:
        //The amount should be greater than zero.
        //The amount should be a multiple of 100 (common ATM rule).
        //The amount should not exceed the account balance.
        //4️⃣ Deduct the amount from the balance if conditions are met.
        //5️⃣ Display the updated balance or an error message if the withdrawal fails.

        int initialAmount = 20000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER WITHDRAWAL AMOUNT");
        int withdraw = scanner.nextInt();
       int currentBalance;

       if(withdraw<=0 ){
           System.out.println(" Please Enter Amount to withdraw");
       }else if(withdraw>initialAmount){
           System.out.println("Insufficient Balance");
       }else if(withdraw%100!=0){
           System.out.println("Enter Amount should be multiple amount");
       }else{
           currentBalance= initialAmount-withdraw;
           System.out.println("Rupees " +  withdraw + " is successfully debited from your account");
           System.out.println("Your current Balance is :" + currentBalance);
       }



        }





    }

