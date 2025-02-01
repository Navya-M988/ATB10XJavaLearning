package ex_04_Operators;

import java.util.Scanner;

public class Lab22_Ternary_Operators {

    public static void main(String[] args) {
        //Scenario: A student needs at least 40 marks to pass. Write a Java program using the
        // ternary operator to determine if the student passed or failed.
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Marks:");
        int Marks = scanner.nextInt();
        String Result = (Marks >= 40 ) ? "Pass" : "Fail" ;
        System.out.println(Result);





    }


}
