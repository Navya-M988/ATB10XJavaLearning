package Daily_Excercises;

import java.util.Scanner;

public class Exc_019 {
    public static void main(String[] args) {
        //check if a number is a palindrome

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int original= num;
        int reverse = 0;

        while(num>0){
           int digit = num%10;// extract the last digit
            System.out.println(digit);
           reverse = reverse*10+digit;  // BUILD THE REVERSE NUMBER
           num = num/10;  // remove the last digit
            System.out.println(reverse);
        }

        if(original == reverse){
            System.out.println("nmber is a Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        scanner.close();



          }



        }







