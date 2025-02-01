package ex_04_Operators;

public class Lab19_Operators_Relational {
    public static void main(String[] args) {
        //Write a program to check if a person is eligible to vote (age >= 18).
        //
        //Example Output:

        //Enter age: 20
        //You are eligible to vote.

        int age = 20;
        if (age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }



        //Write a program to compare two numbers and print which one is greater or if they are equal.
        //Use >, <, and ==.
        //Example Output:
        //Enter first number: 10
        //Enter second number: 15
        //15 is greater than 10.

        int first_Number = 10;
        int Second_Number = 15;
        System.out.println("Enter first number: "+ first_Number);
        System.out.println("Enter second number: "+ Second_Number);



        if (first_Number==Second_Number){
            System.out.println("Equal");
        } else if (first_Number<Second_Number) {
            System.out.println("15 is greater than 10.");

        }else{
            System.out.println("15 is less than 10.");
        }


    }
}
