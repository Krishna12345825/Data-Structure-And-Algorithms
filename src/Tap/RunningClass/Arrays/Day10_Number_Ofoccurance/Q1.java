package Tap.RunningClass.Arrays.Day10_Number_Ofoccurance;

import java.util.Scanner;


/*
input:-

7
3 7 5 2 5 5 1
5
output:-
3
* */


public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int res = countOccurance(arr,k);
        System.out.println(res);
    }

    static int countOccurance(int arr[], int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k){
                count++;
            }
        }
        return count;
    }
}
