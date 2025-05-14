package Daily_Excercises;

import java.util.Scanner;

public class Exc_014 {
    public static void main(String[] args) {
// Check if a Character is an Alphabet.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);

        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            System.out.println("Character is Alphabet");

        }else{
            System.out.println("Not an Alphabet");
        }

    }
}
