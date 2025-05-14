package Daily_Excercises;

import java.util.Scanner;

public class Exc_21 {
    public static void main(String[] args) {

        // Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//              * Take the below User info and store it into the variables:
//              Age (integer)
//              Salary (double or float)
//              Credit Score (integer)
//              Age Validation:
//              :- Check if the age is a positive integer.
//              :- Ensure the age is at least 18 years old.
//              :- Max age can be 80.
//              Salary Validation:
//              :- Check if the salary is a positive number.
//              :- Define a minimum salary threshold (e.g., 30,000).
//              Credit Score Validation:
//              :- Check if the credit score is a positive integer.
//              :- Define a minimum credit score threshold (e.g., 650).
//              :- Max credit score threshold (e.g., 850).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age = scanner.nextInt();
        System.out.println("Enter the salary");
        double salary = scanner.nextDouble();
        System.out.println("Your credit Score");
        int creditScore = scanner.nextInt();

       if((Age<18 && Age>80)||salary<30000 ||(creditScore<650 &&creditScore>850) ){
           System.out.println("Age must be between 18 and 80");
           System.out.println("minimum salary threshold (e.g., 30,000)");
           System.out.println("minimum credit score threshold 650 Max 850");
           System.out.println("Not eligible for loan");
       }
       else {
           System.out.println("eligible for loan");


       }
    }
}

