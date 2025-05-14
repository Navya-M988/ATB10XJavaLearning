package Daily_Excercises;

import java.util.Scanner;

public class Exc_015 {
    public static void main(String[] args) {
        // Check if a Number is Prime
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }



    }



    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) { // Loop from 2 to sqrt(n)
            if (n % i == 0) return false; // If divisible, not a prime
        }
        return true; // Prime number if no divisors found
    }
}
