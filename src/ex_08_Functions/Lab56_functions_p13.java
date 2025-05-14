package ex_08_Functions;

import java.util.Scanner;

public class Lab56_functions_p13 {

    public static void main(String[] args) {
//Question: A bank offers a fixed deposit scheme where the interest
// is calculated based on the principal amount and time period.
// Create a function that takes the principal amount and
// the number of years as input and returns the total interest earned.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal Amount");
        int principal_amount = scanner.nextInt();
        System.out.println("Enter number of years");
        int number_of_years= scanner.nextInt();

        int result = Total_intrest(principal_amount, number_of_years);
        System.out.println(result);
      
    }


    static int Total_intrest(int amount ,int years){
        return amount*years;
    }

}
