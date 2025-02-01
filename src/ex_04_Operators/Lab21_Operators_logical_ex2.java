package ex_04_Operators;

import java.util.Scanner;

public class Lab21_Operators_logical_ex2 {
    public static void main(String[] args) {
        //Write a Java program that checks if a number is both greater than 10 and even using &&
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = scanner.nextInt();
        boolean number = a>=10 && a%2 ==0 ;
        if(number){

            System.out.println("Number is Both greater than 10 and Even");
        }else{
            System.out.println("Number is less than 10 and odd");

        }



    }


}
