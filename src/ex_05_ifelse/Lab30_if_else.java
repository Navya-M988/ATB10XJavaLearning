package ex_05_ifelse;

import java.util.Scanner;

public class Lab30_if_else {


    public static void main(String[] args) {

        //A traffic light system shows "Stop" when the signal is red,
        // "Ready" when the signal is yellow, and "Go" when the signal is green.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Signal light!");
        String Signal = scanner.next();

        if(Signal.equalsIgnoreCase("RED") ){
            System.out.println("Stop");


        }else if (Signal.equalsIgnoreCase("Yellow")){
            System.out.println("Ready");
        }else if(Signal.equalsIgnoreCase("Green")){

            System.out.println("Go");
        }else {
            System.out.println("Accident");
        }
    }
}

