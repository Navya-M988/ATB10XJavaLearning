package ex_04_Operators;

public class Lab27_Max_Min_Number {

    public static void main(String[] args) {

        String num1 = args[0];
        int numA = Integer.parseInt(num1);
        String num2 =args[1];
        int numB = Integer.parseInt(num2);

        String maxNum =(numA>numB)? "num A is Max" :"numB is Min";

        System.out.println(maxNum);


    }

}
