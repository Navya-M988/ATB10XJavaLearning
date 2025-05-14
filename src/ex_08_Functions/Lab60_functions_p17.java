package ex_08_Functions;

import java.util.Scanner;

public class Lab60_functions_p17 {
    public static void main(String[] args) {

        //Create a function that takes a number as input and returns whether it is even or odd.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        numeric(number);

    }

    static void numeric(int number){
        if (number%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


    }
}
