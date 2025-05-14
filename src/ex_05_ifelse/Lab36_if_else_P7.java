package ex_05_ifelse;

import java.util.Scanner;

public class Lab36_if_else_P7 {
    public static void main(String[] args) {
        //An electricity company charges customers based on their usage.
        //Units Consumed	Rate per Unit
        //0 - 100	        $1.00
        //101 - 300        	$1.50
        //301 - 500        	$2.00
        //500+	            $2.50

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Unit Consumed");
        int Unit= scanner.nextInt();
        double bill;



        if(Unit>=0 && Unit<=100){
            System.out.println("Electricity Bill : " + Unit*1.00);
        }else if (Unit>100 && Unit<=300){
            System.out.println("Electricity Bill : " + Unit*1.50);
        }else if (Unit>300 && Unit<=500) {
            System.out.println("Electricity Bill : " + Unit * 2);
        }else{
            System.out.println("Electricity Bill" + Unit * 2.50);

        }





    }
}
