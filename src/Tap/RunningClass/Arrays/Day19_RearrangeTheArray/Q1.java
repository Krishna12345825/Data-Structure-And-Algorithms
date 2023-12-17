package Tap.RunningClass.Arrays.Day19_RearrangeTheArray;
/*

Given an Array of positive Integer values and -1. Write a program to put all the -1 to the starting of the array

intput:-
10
5 -1 3 -1 4 5 3 -1 8 2

output:-
-1 -1 -1 5 3 4 5 3 8 2

*/


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i= 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int res[] = rearrange(arr);
        for (int i = 0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }

    static int[] rearrange(int arr[]){
        int i = arr.length-1;
        int j = arr.length-1;

        while (i >=0 ){
            if (arr[i] == -1){
                i--;
            }else {
                arr[j] = arr[i];
                i--;
                j--;
            }
        }
        while (j >= 0){
            arr[j] = -1;
            j--;
        }
        return arr;
    }
}
