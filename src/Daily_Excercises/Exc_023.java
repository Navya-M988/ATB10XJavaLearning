package Daily_Excercises;

import java.util.Scanner;

public class Exc_023 {
    public static void main(String[] args) {

        //Calculate Bonus Based on Salary and Years of Experience.
        // :- take the salary and Year info from the User.
        //Implement Bonus Calculation Logic:
        // Define the bonus structure based on salary and years of experience.
        //:- If years of experience is less than 1 year: No bonus.
        //:- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
        //- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
        // :- If years of experience is greater than 6 years: Bonus is 15% of the salary.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your years of Experience:");
        int Experience = scanner.nextInt();
        System.out.println("Enter your Salary:");
        double salary = scanner.nextDouble();

        if(Experience<1){
            System.out.println("Experience should be atleast 1 year to avail the Bonus");
        }else if(Experience<=3){
            double bonus = salary*5/100;
            System.out.println("Bonus:"+bonus);
            salary = bonus+salary;
            System.out.println("Your net  salary is" + salary);
        }else if(Experience<=6) {
            double bonus = salary * 10 / 100;
            System.out.println("Bonus:"+bonus);
            salary = bonus + salary;
            System.out.println("Your net  salary is" + salary);
        }else{
            double bonus = salary * 15/ 100;
            System.out.println("Bonus:"+bonus);
            salary = bonus + salary;
            System.out.println("Your net  salary is" + salary);
        }





    }
}
