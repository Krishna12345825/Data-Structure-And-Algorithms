package Tap.RunningClass;


import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[] a = {10,2,4,8,7};
        int k = 15;
//        int []a = {1,2,3,4,5,6};
//        int k = 10;
        getsmallestSubarray(a, k);
//        System.out.println( len);


    }

    public static void getsmallestSubarray(int []arr, int k) {
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;
        int endIndex = -1;
        for (int size = 0; size <arr.length; size++) {
            for (int i = 0; i < arr.length - size; i++) {
                int sum = 0;
                for (int j = i; j <= i + size; j++) {
                    sum = sum + arr[j];
                }
                if (sum == k && size < minLength){
                    minLength = size +1;
                    startIndex = i;
                    endIndex = i + size;
                }
            }
        }
        if (minLength != Integer.MAX_VALUE){
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }





}
