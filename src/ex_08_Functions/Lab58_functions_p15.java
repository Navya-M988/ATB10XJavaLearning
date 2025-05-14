package ex_08_Functions;

public class Lab58_functions_p15 {
    public static void main(String[] args) {
        // Find Maximum of Three Numbers
        //Write a function that takes three numbers as input and returns the largest one.

        int a=60;
        int b=40;
        int c=30;
        Maximum_of_three(a,b,c);

    }

    static void Maximum_of_three(int a,int b, int c){
        if(a>b){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else if(a>c){
            System.out.println("a is greater");
        }else {
            System.out.println("c is greater");
        }

    }

}
