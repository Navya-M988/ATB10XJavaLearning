package ex_06_Switch_Statements;

import java.util.Scanner;

public class Lab40_Switch_P4 {
    public static void main(String[] args) {
        //Create an ATM-like program with the following options:
        //1. Check Balance
        //2. Deposit Money
        //3. Withdraw Money
        //4. Exit
        //Ask the user to select an option.
        //If Deposit, ask for an amount and add it to the balance.
        //If Withdraw, ask for an amount and check if it's available before subtracting.
        //If Check Balance, display the current balance.

        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; // Initial balance

        while (true) {
            // Display ATM menu
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check Balance
                    System.out.println("Your current balance is: ₹" + balance);
                    break;

                case 2: // Deposit Money
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("₹" + deposit + " deposited successfully.");
                        System.out.println("Updated balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount! Please enter a positive number.");
                    }
                    break;

                case 3: // Withdraw Money
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully.");
                        System.out.println("Remaining balance: ₹" + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds! Your balance is ₹" + balance);
                    } else {
                        System.out.println("Invalid amount! Please enter a positive number.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the ATM. Have a nice day!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}







