package Daily_Excercises;

import java.util.Scanner;

public class Exc_003 {
    public static void main(String[] args){

        // Check if a Number is Positive or Negative.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        if(number>0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is Negative");
        }


    }
}
