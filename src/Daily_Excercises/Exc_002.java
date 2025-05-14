package Daily_Excercises;

public class Exc_002 {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consonants - 4

        String name = "Vinod Kumar";
        int length = name.length(); //7

        int vowels= 0;
        int consonants = 0;

        for(int i=0; i<length; i++){
            char ch = name.charAt(i);

            if(ch=='a' || ch =='e' ||ch=='i' || ch=='o'||ch=='u'){
                vowels++;
            } else if(ch!= ' ') {
                consonants++;
            }
        }

        System.out.println(consonants);
        System.out.println(vowels);

    }
}
