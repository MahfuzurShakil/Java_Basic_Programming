import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = scanner.nextDouble();
        System.out.print("Annual interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Period(Years): ");
        int years = scanner.nextInt();

        int nmonth = 12*years;
        double r = (interestRate/100)/12;
        double  eq1 = Math.pow(1+r,nmonth);
        double M = (principle*r*eq1)/(eq1-1);

        String result = NumberFormat.getCurrencyInstance().format(M);

        System.out.println("Mortgage: "+result);


    }
}
