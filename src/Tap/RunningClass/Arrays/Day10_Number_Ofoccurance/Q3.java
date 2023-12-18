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
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        secondLargestElement(arr);
    }

    static void secondLargestElement(int arr[]){
        int max = arr[0];
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max1 = max;
                max = arr[i];
            } else if (arr[i] > max1 && arr[i] != max) {
                max1 = arr[i];
            }
        }
        System.out.println(max1);
    }
}
