package Datatypes;

import java.text.NumberFormat;

public class numberFormat {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(34124545);
        System.out.println(result);

        NumberFormat percentage = NumberFormat.getPercentInstance();
        System.out.println(percentage.format(.1));

        String percentage1 = NumberFormat.getPercentInstance().format(.34);
        System.out.println(percentage1);
    }
}
