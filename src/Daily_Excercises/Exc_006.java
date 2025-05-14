package Daily_Excercises;

import java.util.Scanner;

public class Exc_006 {
    public static void main(String [] args){

        // Check if a Character is a Vowel or Consonant.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        String input = scanner.next();

        if(input.length() !=1 ){
            System.out.println("Invalid Character");

        }else {

            char ch = input.charAt(0);
            ch = Character.toLowerCase(ch);

          if(!Character.isLetter(ch)){
              System.out.println("Input is not a letter");
          }else{
             if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'){
                 System.out.println("Vowel");
             }else{
                 System.out.println("consonant");
             }

          }

        }
        scanner.close();

    }
}
