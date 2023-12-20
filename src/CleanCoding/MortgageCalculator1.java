package CleanCoding;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator1 {
    public static void main(String[] args) {

        int principle = (int) readNumber("Principle: ",1_000,1_000_000);
        float annualInterest = (float) readNumber("Annual Interest rate: ",1,30);
        byte years = (byte) readNumber("Years(Period): ",1,30);

        double mortgage = calculateMortgage(principle,annualInterest,years);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+result);
    }

    public static double readNumber(String promt,double min,double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(promt);
            value = scanner.nextByte();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter valid number between"+ min + "and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principle, float annualInterest,byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        double monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;
        int numberOfPayments = years*MONTHS_IN_YEAR;

        return principle*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);
    }
}
