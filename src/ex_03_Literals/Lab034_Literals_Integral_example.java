package ex_03_Literals;

public class Lab034_Literals_Integral_example {
    public static void main(String[] args) {
        //Write a program to calculate the total cost of items in a store.
        // You have 3 apples priced at $2 each, 5 bananas priced at $1 each,
        // and 2 oranges priced at $3 each.

        int No_Apples = 3;
        int Cost_Of_Each_Apple = 2;
        int No_bananas = 5;
        int Cost_of_Each_banana = 1;
        int No_Oranges = 2;
        int Cost_of_Each_Orange = 3;
        int Total_coast = (No_Apples*Cost_Of_Each_Apple)+(No_bananas*Cost_of_Each_banana)+(No_Oranges*Cost_of_Each_Orange);
        System.out.println("Total Cost of items in a store = " + Total_coast+ "$");


        //Write a program to calculate
        // the area of a rectangle (length and breadth are integer literals).
        int length = 3;
        int breadth = 2;
        int Area_of_Rectangle = length*breadth;
        System.out.println("Area of Rectangle is " + Area_of_Rectangle);



    }
}
