package ex_08_Functions;

import java.time.LocalDate;

public class Lab47_functions_p5 {
    public static void main(String[] args) {
        //Write a function getDate() that returns today's date as a String.
        //Call the function in main() and print the result.
      String result=  getDate();
        System.out.println(result);


    }

    static String getDate(){

        LocalDate today = LocalDate.now();
        return("today's Date is : " + today) ;
    }

}

