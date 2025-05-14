package Daily_Excercises;

import java.util.Scanner;

public class Exc_020 {
    public static void main(String[] args) {
        //check if number is a Armstrong number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int original = num;
        int sum =0;
        int digits = 0;

      //Count the digits
        int temp= num;
        while(temp>0){
            temp/=10;
            digits++;
        }

        temp=num;
        while(temp>0){
            int digit = temp%10; // Extract the last digit
            sum += Math.pow(digit , digits);
            temp = temp/10;
        }

        if(original==sum){
            System.out.println("Armstrong number ");
        }else{
            System.out.println("not a Armstrong Number");
        }
        scanner.close();





    }






}
