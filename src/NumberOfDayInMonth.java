import java.util.Scanner;

public class NumberOfDayInMonth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month,year;
        System.out.print("Enter number of month: ");
        month = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        if(month == 1 || month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12){
            System.out.println("31 days");
        }else if(month == 4 || month == 6 ||month == 9 ||month == 11){
            System.out.println("30 Days");
        }else{
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("29 Days");
        } else {
            System.out.println("28 Days");
        }
        }


    }
}
