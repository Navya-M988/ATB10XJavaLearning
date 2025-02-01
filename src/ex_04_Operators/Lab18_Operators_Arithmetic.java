package ex_04_Operators;

public class Lab18_Operators_Arithmetic {
    public static void main(String[] args) {
        // Write a program to calculate the total salary of an employee
        // given the basic salary, bonus, and deductions.
//Use +, -, *, /, and %
        //expected outcome
        //Basic Salary: 5000
        //Bonus: 1000
        //Deductions: 700
        //Total Salary: 5300

       int Basic_Salary = 5000;
       int Bonus = 1000;
       int deductions = 700;
       int Total_salary = (Basic_Salary+Bonus)-deductions;
        System.out.println("Basic Salary = "+ Basic_Salary);
        System.out.println("Bonus = "+ Bonus);
        System.out.println("Deductions = "+ deductions);
        System.out.println("Total salary ="+Total_salary);

        //Write a program to calculate the area and circumference of a circle
        // given the radius. Use * and /.
        //
        //Formula:
        //
        //Area = π * radius * radius
        //Circumference = 2 * π * radius

        double radius = 2.5f;
        final double pi = 3.14;
        double Area = radius*radius*pi;
        double Circumference = 2 * pi * radius;
        System.out.println("Area : "+Area);
        System.out.println("Circumference  :"+Circumference);

        //Write a program to perform basic arithmetic operations
        // (addition, subtraction, multiplication, division) on two numbers provided by the user.

        int a= 10;
        float b= 10.5f;
        System.out.println(a+b);
        System.out.println(a-b);

        System.out.println(a*b);

        System.out.println(a%b);
        System.out.println(a/b);













    }
}
