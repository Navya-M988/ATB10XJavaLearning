package Daily_Excercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exc_009 {
    public static void main(String[] args){

        // Find the Largest of Three Numbers.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=scanner.nextInt();
        System.out.println("Enter Second number");
        int num2=scanner.nextInt();
        System.out.println("enter third number");
        int num3=scanner.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("all are equal : "+num1);
        }else if(num1>=num2 && num1>=num3){
            System.out.println("num 1 is the greatest: "+num1);
        }else if(num2>=num1 && num2>=num3){
            System.out.println("num 2 is the greatest : "+ num2);
        }else {
            System.out.println("num 3is the greatest: "+ num3);
        }




       /* if(num1>num2){
          System.out.println("num1 is greater: "+ num1);
        }else if(num2>num3){
            System.out.println("num 2 is greater: "+ num2);
        }else if(num3>num1){
            System.out.println("num3 is greater: "+num3);
        }else {
            System.out.println(num1);*/
        }

    }
