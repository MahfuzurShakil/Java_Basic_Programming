package ControlFlow;

public class IfStatements {
    public static void main(String[] args) {
        int temperature = 23;

        if(temperature > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temperature > 20)
            System.out.println("It's a beautiful day");
        else
            System.out.println("Cold day");

        int income = 120_000;

        //Simplifying If statements
        //1st way
//        boolean hasHighIncome;
//        if (income > 100_000)
//            hasHighIncome = true;
//        else
//            hasHighIncome = false;

        //2nd way
//        boolean hasHighIncome = false;
//        if (income > 100_000)
//            hasHighIncome = true;

        //3rd way
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

    }
}
