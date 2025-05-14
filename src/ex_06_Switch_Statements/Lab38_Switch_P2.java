package ex_06_Switch_Statements;

import java.util.Scanner;

public class Lab38_Switch_P2 {
    public static void main(String[] args) {
        //Scenario: Enter two numbers and an operation (+, -, *, /) to perform calculations.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);
        double result;

switch (operator){
    case '+':
        result = num1+num2;
        System.out.println("Result : " + result);
        break;

    case'-':
        result = num1-num2;
        System.out.println("Result : " + result);
        break;

    case'*':
        result = num1*num2;
        System.out.println("Result : " + result);
        break;
    case'/':
        if(num2!=0){
        System.out.println(num1/num2);
        }else
       {
            System.out.println("num2 should not be 0");
           break;
        }
    default:
        System.out.println("Invalid Operator(Enter'+','-','*','/') ");

    }

        scanner.close();



}



    }




