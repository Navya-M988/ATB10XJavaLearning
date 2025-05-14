package ex_05_ifelse;

import java.util.Scanner;

public class Lab33_if_else_p4 {

    public static void main(String[] args) {
        //A cinema allows:
        //Children (below 13) to watch only animated movies.
        //Teenagers (13-17) to watch PG-13 movies.
        //Adults (18+) to watch all movies.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age");
        int Age = scanner.nextInt();

        if(Age<13){
            System.out.println("Watch only animated movies");


        }else if(Age<18){
            System.out.println("watch PG-13 movies");
        }else{
            System.out.println("watch all movies");
        }






    }



}
