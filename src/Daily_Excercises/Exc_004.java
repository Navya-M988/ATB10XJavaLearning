package Daily_Excercises;

import java.util.Scanner;

public class Exc_004 {
    public static void main(String [] args){
        //Check if a Number is Even or Odd.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if(number%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }






    }
}
