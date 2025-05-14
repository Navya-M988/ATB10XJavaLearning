package Daily_Excercises;

import java.util.Scanner;

public class Exc_022 {
    public static void main(String[] args) {

        //Electricity Bill Calculation (Based on Units Consumed)
        //:- take the input from the user of Units.
        // Implement Rate Structure:
        //  Define the rate structure for calculating the bill based on the number of units consumed.
        //:-  First 100 units: 0.50Rs per unit
        //:-  Next 100 units (101-200): 0.75Rs per unit
        //:- Next 100 units (201-300): 1.20Rs per unit
        // :- Above 300 units: 1.50Rs per unit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Units consumed");
        double units = scanner.nextDouble();

        if(units>0 && units<=100){
            double totalRate = 0.50*units;
            System.out.println("Total Bill:" + totalRate);
        }else if(units>100 && units<=200){
            double totalRate = 0.75*units;
            System.out.println("Total Bill:" + totalRate);
        }else if(units>200 && units<=300){
            double totalRate = 1.20*units;
            System.out.println("Total Bill:" + totalRate);
        }else{
            double totalRate = 1.50*units;
            System.out.println("Total Bill:" + totalRate);
        }

    }
}
