package ex_06_Switch_Statements;

import java.util.Scanner;

public class Lab37_Switch_P1 {
    public static void main(String[] args) {
        //Given a number (1-7), print the corresponding day of the week.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day(1-7)");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

        }
scanner.close();







    }









}
