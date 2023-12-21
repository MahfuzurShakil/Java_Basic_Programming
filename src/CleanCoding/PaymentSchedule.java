package CleanCoding;

import java.text.NumberFormat;
import java.util.Scanner;

public class PaymentSchedule {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;
    public static void main(String[] args) {

        int principle = (int) readNumber("Principle: ",1_000,1_000_000);
        float annualInterest = (float) readNumber("Annual Interest rate: ",1,30);
        byte years = (byte) readNumber("Years(Period): ",1,30);

        double mortgage = calculateMortgage(principle,annualInterest,years);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("---------");
        System.out.println("Monthly payment: "+result);

        System.out.println();
        System.out.println("Payment Schedule ");
        System.out.println("-----------------");
        for (short month=1; month <= years*MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principle,annualInterest,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }


    }

    public static double readNumber(String promt,double min,double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(promt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter valid number between"+ min + "and " + max);
        }
        return value;
    }

    public static double calculateBalance(int principle, float annualInterest,byte years,
                                          short numberOfPaymnetsMade){


        double monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;
        int numberOfPayments = years*MONTHS_IN_YEAR;

        double balance = principle*(Math.pow(1 + monthlyInterest,numberOfPayments)
        - Math.pow(1 + monthlyInterest,numberOfPaymnetsMade))
                / (Math.pow(1 + monthlyInterest,numberOfPayments) - 1);

        return balance;
    }

    public static double calculateMortgage(int principle, float annualInterest,byte years){

        double monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;
        int numberOfPayments = years*MONTHS_IN_YEAR;

        return principle*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);
    }
}
