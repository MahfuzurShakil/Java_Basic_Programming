package Datatypes;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        Scanner scanner = new Scanner(System.in);
        int principle=0;
        float annualInterest;
        byte years;

        while (true) {
            System.out.print("Principle: ");
            principle = scanner.nextInt();
            if (principle < 1000 || principle > 1000000) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                continue;
            }
            else
                break;
        }

        while (true){
            System.out.print("Annual interest rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest>=1 && annualInterest <=30)
                break;
            System.out.println("Enter valid number greater than 0 and less than 30");
        }

        double monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;

        while (true){
            System.out.print("Period(Years): ");
            years = scanner.nextByte();
            if (years>=1 && years <=30)
                break;
            System.out.println("Enter valid number between 1 and 30");
        }

        int numberOfPayments = years*MONTHS_IN_YEAR;

        double mortgage = principle*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+result);


    }
}
