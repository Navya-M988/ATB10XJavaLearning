package ex_08_Functions;

import java.util.Scanner;

public class Lab61_functions_p18 {
    public static void main(String[] args) {
        //Write a function to find the maximum of two numbers.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num1");
        int num1 = scanner.nextInt();
        System.out.println("enter num2");
        int num2 = scanner.nextInt();

        maxNum(num1, num2);

    }

    static void maxNum(int num1,int num2){
        if(num1>num2){
            System.out.println("num1 is greater");
        }else if(num2>num1){
            System.out.println("num2 is greater");
        }else if(num1==num2){
            System.out.println("both are equal");
        }else {
            System.out.println("enter a valid number");
        }


    }


}
