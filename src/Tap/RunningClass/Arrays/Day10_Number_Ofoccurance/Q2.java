package Tap.RunningClass.Arrays.Day10_Number_Ofoccurance;

import java.util.Scanner;

/*
input:-
8
3 2 7 3 4 1 7 5

output:-
2

* */


public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int res = maximumNumberOccurance(arr);
        System.out.println(res);
    }

    static int maximumNumberOccurance(int arr[]){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > max){
                max = arr[i];
                count++;
            }
        }
        return count;
    }
}
