package ControlFlow;

public class TernaryOperator {
    public static void main(String[] args) {
        int income = 90_000;
        //For ternary operator we need first set a condition
        //If conditon true it add first value
        //Otherwise it add other value
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}
