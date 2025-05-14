package Daily_Excercises;

import java.util.Scanner;

public class Exc_011 {
    public static void main(String[] args) {
        //Find the Smallest of Three Numbers.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= scanner.nextInt();
        System.out.println("Enter num2");
        int num2= scanner.nextInt();
        System.out.println("Enter num3");
        int num3= scanner.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("All are equal: "+num1);
        }else if(num1<=num2 && num1<=num3){
            System.out.println("num 1 is the smallest: "+num1);
        }else if(num2<=num1 && num2<=num3){
            System.out.println("num 2 is the smallest: "+num2);
        }else {
            System.out.println("num 3 is the smallest: "+num3);
        }









    }
}
