package Daily_Excercises;

import java.util.Scanner;

public class Exc_005 {
    public static void main(String [] args){
     //Find the Maximum of Two Numbers.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("num1 is Maximum");
        }else{
            System.out.println("num 2 is Maximum");
        }
    }
}
