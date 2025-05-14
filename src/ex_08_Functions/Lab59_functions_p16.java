package ex_08_Functions;

import java.util.Scanner;

public class Lab59_functions_p16 {
    public static void main(String[] args) {
        //Write a function to add two numbers and return the result.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number1");
        int num1 = scanner.nextInt();
        System.out.println("enter a number2");
        int num2 = scanner.nextInt();

       int total= result(num1,num2);
        System.out.println(total);


    }

    static int result(int num1, int num2) {
    return(num1+num2);

    }
}





