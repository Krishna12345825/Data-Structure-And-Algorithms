package assignments.saurabhSukhla.arrays16;
//2. Write a program to calculate the average of numbers stored in an array of size 10.
//Take array values from the user

import java.util.Arrays;

public class Q2AverageOfNumber {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 12;
        arr[1] = 12;
        arr[2] = 12;


        averageOfNumber(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void averageOfNumber(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        float avg = (float) (sum / 10.0);
        System.out.println(avg);
    }

}
