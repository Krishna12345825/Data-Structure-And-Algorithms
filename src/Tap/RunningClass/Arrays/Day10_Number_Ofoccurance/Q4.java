package Tap.RunningClass.Arrays.Day10_Number_Ofoccurance;

import java.util.Scanner;

/*
  second largest Number
  input:
  7
  3 5 4 7 6 10 8
  output:-
  8
* */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        secondSmallestElement(arr);
    }

    static void secondSmallestElement(int arr[]){
        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i];
            }
        }
        System.out.println(min2);
    }
}
