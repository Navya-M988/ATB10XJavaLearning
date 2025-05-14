package ex_08_Functions;

public class Lab53_functions_p10 {
    public static void main(String[] args) {
        // A function that takes an item name and price, then prints the bill.
        bill("book",50);

    }

    static void bill (String name, int price){
        System.out.println("Item : "+ name+ " \nprice :" +price);
    }

}
