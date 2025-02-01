package ex_04_Operators;

public class Lab24_GradeCalculator {
    public static void main(String[] args) {

 String Marks = args[0];
 int totalMarks = Integer.parseInt(Marks);
 String Grade = (totalMarks >= 90 && totalMarks <= 100)? "A" :
         (totalMarks >= 80 && totalMarks <= 89)? "B" :
                 (totalMarks >= 70 && totalMarks <= 79)? "C" :
                         (totalMarks >= 60 && totalMarks <= 69)? "D" : "F";

        System.out.println(Grade);







    }
}
