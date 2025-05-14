package ex_07_For_while_Dowhile_Loop;

import java.util.Scanner;

public class Lab41_for_P1 {

    public static void main(String[] args) {
        //Write a program that takes a number as input and
        // prints its multiplication table (1 to 10) using a for loop.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number : ");
        int number= scanner.nextInt();

        for (int i = 0; i <=10 ; i++) {
            System.out.println(number +  "X" + i + "=" +(number*i));

        }



    }
}
