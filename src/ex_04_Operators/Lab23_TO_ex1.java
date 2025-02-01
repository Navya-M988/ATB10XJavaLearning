package ex_04_Operators;

public class Lab23_TO_ex1 {
    public static void main(String[] args) {
        //Scenario: Given two numbers,
        // use the ternary operator to determine and print the greater number.

        String a =args[0];
        int number1= Integer.parseInt(a);
        String  b= args[0] ;
        int number2= Integer.parseInt(b);

        String greaterNumber = (number1>number2) ? "a is greater" : "b is greater";
        System.out.println(greaterNumber);

    }

}
