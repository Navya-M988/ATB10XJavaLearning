package ex_04_Operators;

public class Lab25_Largest_Number {

    public static void main(String[] args) {

     String num1 = args[0];
     int numA =Integer.parseInt(num1);
        String num2 = args[1];
        int numB =Integer.parseInt(num2);

        String num3 = args[2];
        int numC =Integer.parseInt(num3);

        String largestNumber = (numA>numB)? "num A is greater": (numB>numC)? "num B is greater":
                (numC>numA)? "num C is greater": "num A is greater";
        System.out.println(largestNumber);








    }
}
