package ex_08_Functions;

import java.util.Random;

public class Lab51_functions_p8 {

    public static void main(String[] args) {
      double Temp=  currentTemperature();
        System.out.println("Current temperature is " + Temp);

        //Get Current Temperature
        //Write a function currentTemperature() that returns a fixed or random temperature value (e.g., 28°C).
        //Print the temperature in main().


    }

    static double currentTemperature(){
        Random rand = new Random();
        return 20+ rand.nextDouble()*15;

    }

    //<return type> <fuction name> (<arguments>){
        //logic

       // return
    }


