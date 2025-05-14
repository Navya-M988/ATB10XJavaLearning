package Daily_Excercises;

import java.util.Scanner;

public class Exc_017 {
    public static void main(String[] args) {
        //Check if a Number is Divisible by 5 and 11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        if(number%5==0){
            System.out.println("Number is divisible by 5");
        }else if(number%11==0){
            System.out.println("Number is divisible by 11");
        }else{
            System.out.println("Number is not divisible by 5 and 11");
        }

    }
}
