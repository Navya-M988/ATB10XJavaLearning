package Daily_Excercises;

public class Exc_001 {
    public static void main(String[] args) {

        //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5,
        // print "FizzBuzz."
        //(for loop, if else)

        int i=0;
        for(i=0; i<=100; i++){

            if(i%3==0 && i%5==0){
                System.out.println("Fizz Buzz");
            }else if(i%3==0){
                System.out.println("Fiz");
            }else if(i%5==0 ){
                System.out.println("Buzz");
            }


            else{
                System.out.println(i);
            }




        }





    }

}
