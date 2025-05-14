package ex_05_ifelse;

import java.util.Scanner;

public class Lab35_if_else_P6 {
    public static void main(String[] args) {
        //A simple login system where the user must enter the correct username and password.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Valid Username");
        String Username = scanner.next();
        System.out.println("Enter Valid Password");
        String Password = scanner.next();

        if(Username.equals("Kavya")&&Password.equals("12345")){
            System.out.println("Successful Login");
        }else{
            System.out.println("Invalid Username or Password");
        }







    }
}
