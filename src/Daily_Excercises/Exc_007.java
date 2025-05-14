package Daily_Excercises;

import java.util.Scanner;

public class Exc_007 {
    public static void main(String[]args){

        //Check if a Person is Eligible to Vote (Age Check).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        if(scanner.hasNextInt()){
          int age= scanner.nextInt();

          if(age<=0 || age >100){
            System.out.println("Invalid input ");
        }else if(age>=18){
            System.out.println("eligible to vote");
        }else {
            System.out.println("not eligible to vote");
        }

            }
         if(scanner.hasNextDouble()){
            System.out.println("Enter valid input");
        }else{
             System.out.println("enter numeric input");
         }

        }}









