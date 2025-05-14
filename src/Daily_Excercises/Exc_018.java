package Daily_Excercises;

import java.util.Scanner;

public class Exc_018 {
    public static void main(String[] args) {
        //Convert Days into Years, Months, and Days.
        // Take the Days Input from the User
        // Define the conversion logic:
        // Assume 1 year = 365 days.
        // Assume 1 month = 30 days
        // Convert the Days into Years, Month and days and Print it.
        //if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Days");
        int days = scanner.nextInt();
        int year = days/365;
        int month = days/30;

        System.out.println(year + "years");
        System.out.println(month + "month");





    }
}
