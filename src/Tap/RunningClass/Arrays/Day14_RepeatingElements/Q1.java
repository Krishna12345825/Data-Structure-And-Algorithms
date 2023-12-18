package Tap.RunningClass.Arrays.Day14_RepeatingElements;


import java.util.Scanner;

/*
   Largest Repeating Number
   input:-
   10
   2 3 3 3 4 5 7 7 9 11
   output:-
   7
* */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        largestRepeatingNumber1(arr);
    }

    static void largestRepeatingNumber(int arr[]){
        for (int i = arr.length-2; i >= 0; i--) {
            if (arr[i] == arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }


    static void largestRepeatingNumber1(int arr[]){
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == arr[i-1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
