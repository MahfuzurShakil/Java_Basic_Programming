import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        double monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();

        int numberOfPayments = years*MONTHS_IN_YEAR;

        double mortgage = principle*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/
                (Math.pow(1+monthlyInterest,numberOfPayments)-1);

        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+result);


    }
}
