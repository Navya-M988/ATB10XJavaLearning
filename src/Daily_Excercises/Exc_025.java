package Daily_Excercises;

import java.util.Scanner;

public class Exc_025 {
    public static void main(String[] args) {
        //21)  Find if a Person Can Travel Based on Visa Status and Age.
        //take the input from the user for
        //Age (integer).
        //Visa Status (String or boolean).
        //heck Eligibility:
        //:- If age is 18 or older and visa status is valid, the person can travel.
        //Otherwise, the person cannot travel.
        //Validation Criteria
        //Age: - Must be a non-negative integer.
        //:- Should be greater than or equal to 18 to be eligible to travel.
        //Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
        //:- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("Age must be equal to 18 or greater");
        }
        System.out.println("is your visa status is valid?");
        boolean isVisaValid = scanner.nextBoolean();

        if(age>=18 && isVisaValid){
            System.out.println("you are allowed to Travel");
        }else{
            System.out.println("Not allowed to travel");
        }






        
    }
}
