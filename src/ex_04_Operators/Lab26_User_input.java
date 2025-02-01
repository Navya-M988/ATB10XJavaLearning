package ex_04_Operators;

public class Lab26_User_input {

    public static void main(String[] args) {

        String Name = args[0];
        String Age1 =args[1];
        int Age = Integer.parseInt(Age1);
        String Salary1 = args[2];
        int Salary = Integer.parseInt(Salary1);

        System.out.println("Name:"+ Name );
        System.out.println("Age:"+ Age );
        System.out.println("Salary:"+ Salary);

    }
}
