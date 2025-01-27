package ex_03_Literals;

public class lab035_Literals_floating_example {
    public static void main(String[] args) {
        //Write a program to calculate the average of marks
        // in 5 subjects: 89.5, 78.0, 94.5, 88.0, and 76.5.

        float s1_marks = 89.5f ;
        float s2_marks = 78.0f;
        float s3_marks = 94.5f;
        float s4_marks = 88.0f;
        float s5_marks = 76.5f;
        double total_marks = s1_marks+s2_marks+s3_marks+s4_marks+s5_marks;
        double Avg_marks = total_marks/5 ;
        System.out.println("Average of marks in 5 subjects : " + Avg_marks);


        //Write a program to calculate the total price of a meal after applying a discount
        // (use floating-point literals for prices and discounts).

        double price_Of_Meal = 120.50;
        double Discount = 12.5;
        double Total_price =( Discount/price_Of_Meal)*100;
        System.out.println("Total price of the meal is " + Total_price);




    }
}
