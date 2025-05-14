package ex_08_Functions;

public class Lab55_functions_p12 {
    public static void main(String[] args) {
       // A function that takes student details and prints their marks.
        Student_details("kavya","M",100);
    }

    static void Student_details(String firstName,String lastName ,int Marks){

        System.out.println("Student Name : "+firstName + lastName+ "\n Marks : "+Marks);
    }
}
