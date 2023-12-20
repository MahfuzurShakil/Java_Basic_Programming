package ControlFlow;

import java.util.Scanner;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            System.out.println("Hello world "+i);
        }

        for (int i=5; i>0; i--){
            System.out.println(i);
        }

        //When we don't know how many times we need run statements, should use While loop
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);

        }

        do{
            System.out.println("GG");
        }while (!input.equals("quit"));

        //For Each Loop
        String[] fruits = {"Apple", "Mango","Banana"};
        for(String fruit:fruits)
            System.out.println(fruit);
    }
}
