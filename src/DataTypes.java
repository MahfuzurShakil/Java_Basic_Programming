import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        //Two data types Primitive and Reference type
        //Primitive data types are byte,int,Float, Double
        //Reference type types are Date and many more

        int a=10;
        System.out.println(a);

        Date now = new Date();
        System.out.println(now);

        //Reference types are copied by the references whereas primitive types copied by their value

        int x=2;
        int y=x;

        x=4;

        System.out.println(y);

        Point point1 = new Point(2,1);
        Point point2 = point1;
        point1.x=5;
        System.out.println(point2);

        //String are reference type in java.


        String message = " Hello world";
        System.out.println(message.length());
        System.out.println(message.endsWith("d"));
        System.out.println(message.startsWith("Shakil"));
        System.out.println(message.indexOf(" "));
        System.out.println(message.replace("world","Noor"));//It does not change the original string
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());


        //Add double quote in string by \ , prefix backslash by backslash, \n for new line
        //and /t for tab



        String name = "Mahfuzur \"Shakil\"";
        String file = "C:\\Windows\\...";
        System.out.println(name);
        System.out.println(file);


        //Arrays

        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[4]=2;

        System.out.println(Arrays.toString(numbers));

        int[] nums = {2,1,4,3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


    }

}
