package ex_06_Switch_Statements;

import java.util.Scanner;

public class Lab39_Switch_P3
{

    public static void main(String[] args) {
    //Write a Java program that takes a character input (A, B, C, D, F)
        // and prints the corresponding grade description.
        //Grade	  Description
        //A	      Excellent
        //B	      Good
        //C	      Average
        //D       Poor
        //F	      Fail

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a character input(A/B/C/D/F)");
        char input = scanner.next().charAt(0);
        String result;

        switch(input){

            case'A':
                result = "Excellent";
                System.out.println("Result : " + result );
                break;
            case'B':
                result = "Good";
                System.out.println("Result : " + result );
                break;
            case'C':
                result = "Average";
                System.out.println("Result : " + result );
                break;
            case'D':
                result = "Poor";
                System.out.println("Result : " + result );
                break;
            case'F':
                result = "Fail";
                System.out.println("Result : " + result );
                break;
            default:
                System.out.println("Entered invalid character");





        }

        scanner.close();








    }
}
