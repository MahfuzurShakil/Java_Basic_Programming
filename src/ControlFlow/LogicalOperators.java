package ControlFlow;

public class LogicalOperators {
    public static void main(String[] args) {
        int temperature = 12;
        boolean isWarm = temperature >20 && temperature < 30;
        System.out.println("Temparature is warm: "+isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println("Is eligible for loan: "+isEligible);
    }
}
