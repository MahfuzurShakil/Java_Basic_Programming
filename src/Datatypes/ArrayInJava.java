package Datatypes;

import java.util.Arrays;
public class ArrayInJava {
    public static void main(String[] args) {
        //Single dimension Array

        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[4]=2;

        System.out.println(java.util.Arrays.toString(numbers));

        int[] nums = {2,1,4,3};
        java.util.Arrays.sort(nums);
        System.out.println(java.util.Arrays.toString(nums));

        //Multidimensional array

        int[][] mArray = new int[2][3];
        mArray[0][1]=2;
        //For printing multidimensional array we need use Arrays.deeptostring() function
        System.out.println(Arrays.deepToString(mArray));

        int[][] mArray1 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(mArray1));
    }
}
