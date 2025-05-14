package ex_08_Functions;

import java.util.Scanner;

public class Lab57_functions_P14 {
    public static void main(String[] args) {
       //Write a function that takes an age as input and
        // returns whether the person is eligible to vote (age ≥ 18).

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        person_eligible_to_vote(age);


    }

   static void  person_eligible_to_vote(int age){
        if(age>=18){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }

   }


}
