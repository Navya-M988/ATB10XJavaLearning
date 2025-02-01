package ex_03_Literals;

public class Lab15_Literals_char {
    public static void main(String[] args) {
        //Write a program to check if a given character is a vowel.
        char letter = 'N';
        if(letter == 'a' || letter== 'e' || letter== 'i' || letter== 'o' || letter=='u'||
        letter== 'A' || letter== 'E' || letter== 'I' || letter== 'O' || letter=='U'){

            System.out.println("letter is Vowel ");
        }else{

            System.out.println("letter is consonant");
        }

    }
}
