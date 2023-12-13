package ControlFlow;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of the day: ");
        int numberOfWeekDay = scanner.nextInt();


        switch (numberOfWeekDay){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
