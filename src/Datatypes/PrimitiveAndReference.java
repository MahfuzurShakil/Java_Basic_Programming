package Datatypes;

import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class PrimitiveAndReference {
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

        //Constant Variable, write "final" keyword before declare a variable
        final float PI = 3.14F;

        //Post fix and pre fix concept
        int x1 = 1;
        int y1 = x1++;//If post fix, first x will copy to y then it will increase
        System.out.println("x= "+x1+" y= "+y1);

        int x2 = 1;
        int y2 = ++x2;//Opposite for pre fix
        System.out.println("x= "+x2+" y= "+y2);

        //Two ways to increase by two
        int z=1;
        //x = x+2;
        z +=2;//It's called augmented/Compound sign operator
        System.out.println(z);

        //Implicit casting(Automatic conversion)
        //byte>short>int<long>float>double
        //It happens when there is no chance of data lose
        short x3 = 4;
        int y3 = x3+5;
        System.out.println(y3);

        //Explicit casting
        //We can't cast string to number
        double d = 2.3;
        int d1 = (int)d + 3;
        System.out.println(d1);

        //

        String s = "22";
        int ss = Integer.parseInt(s) +2;
        System.out.println(ss);

        //Math function
        int result = (int) Math.ceil(2.8F);
        System.out.println(result);

        int result1 = (int) Math.floor(6.7);
        System.out.println(result1);

        int max = Math.max(result,result1);
        System.out.println(max);

        double random = Math.random();
        System.out.println("A random number between 0 and 1: "+random);

        //How generate random number 0 to 100
        int random1 =(int) Math.round(Math.random()*100);
        System.out.println(random1);

        //Scan Input
        Scanner scanner = new Scanner(System.in);
//        int abc = scanner.nextInt();
//        System.out.println(abc);

        System.out.print("Enter your name");
        String name1 = scanner.nextLine().trim();
        System.out.println(name1);






    }

}
