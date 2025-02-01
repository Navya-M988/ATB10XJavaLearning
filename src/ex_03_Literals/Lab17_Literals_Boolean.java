package ex_03_Literals;

public class Lab17_Literals_Boolean {
    public static void main(String[] args) {
        //Write a program to check if a number is positive.
        int num = -1;
        boolean is_Number_Positive = num>0;
        System.out.println(is_Number_Positive);

       // Write a program to determine if a person is eligible to vote
        // (use age as an integer literal and a boolean literal for the condition).

        int age = 17;
        boolean is_eligible_to_Vote = age>= 18;
        System.out.println(is_eligible_to_Vote);

    }
}
