package Daily_Excercises;

import java.util.Scanner;

public class Exc_013 {
    public static void main(String[] args) {
        //Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
        //
        //1️⃣ Take user input for marks (Use Scanner class).
        //2️⃣ Check the validity of marks (ensure they are between 0 and 100).
        //3️⃣ Use if-else-if conditions to determine the grade based on marks.
        //4️⃣ Display the grade as output.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Marks");
        int Marks =scanner.nextInt();

        /*90 - 100   A+
        80 - 89      A
        70 - 79      B
        60 - 69      C
        50 - 59      D
        40 - 49      E
        Below 40   Fail*/


        if(Marks<0 || Marks>100){
            System.out.println("Marks should be between 0 to 100");
        }else if(Marks>=90 && Marks<=100){
            System.out.println("A+");
        }else if(Marks>=80 && Marks<=89){
            System.out.println("A");
        }else if(Marks>=70 && Marks<=79){
            System.out.println("B");
        }else if(Marks>=60 && Marks<=69){
            System.out.println("C");
        }else if(Marks>=50 && Marks<=59){
            System.out.println("D");
        }else if(Marks>=40 && Marks<=49) {
            System.out.println("E");
        }else{
            System.out.println("Fail");
        }

    }
}
