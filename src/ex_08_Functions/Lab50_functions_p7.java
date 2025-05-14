package ex_08_Functions;

import java.util.Random;

public class Lab50_functions_p7 {
    public static void main(String[] args) {
        //Write a function generateOTP() that returns a random 4-digit number as an OTP.
        //Print the OTP inside main().
        int OTP= generateOTP();
        System.out.println("Your OTP is : " + OTP);

    }

    static int generateOTP(){
        Random rand = new Random();
        return(1000+ rand.nextInt(9000));
    }


}
