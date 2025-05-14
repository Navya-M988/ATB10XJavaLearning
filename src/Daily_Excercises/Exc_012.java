package Daily_Excercises;

import java.util.Scanner;

public class Exc_012 {
    public static void main(String[] args) {
        //Check if a Year is a Leap Year.((divisible by 4, but not 100),(divisible by 400)

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();


        if(year<=0) {
            System.out.println("Enter valid input");}

         if((year%4==0 && year%100!=0) ||year%400==0 ){
            System.out.println("Leap year: "+year);

        }else {
            System.out.println("not a leap year");

         }
        }

        }



