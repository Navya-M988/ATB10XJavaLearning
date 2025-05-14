package ex_05_ifelse;

import java.util.Scanner;

public class Lab34_if_else_P5 {
    public static void main(String[] args) {
        //A year is a leap year if:
        //It is divisible by 4.
        //It is not divisible by 100, unless also divisible by 400.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        int Year = scanner.nextInt();

        if((Year%4==0 && Year%100!=0)||(Year%400==0)){
            System.out.println(" year is a leap year");
        }else{
        System.out.println("Not a leap year");}


    }
}
