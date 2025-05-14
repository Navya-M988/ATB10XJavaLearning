package Daily_Excercises;

import java.util.Scanner;

public class Exc_010 {
    public static void main(String[] args) {
        //Find the Smallest of Two Numbers.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();

        if(num1==num2 ){
            System.out.println("num 1 & mum2 are  equal: "+num1);
        }else if(num1<num2){
            System.out.println("num 1 is the smallest: "+num1);
        }else{
            System.out.println("num 2 is the smallest: "+num2);
        }




    }
}
