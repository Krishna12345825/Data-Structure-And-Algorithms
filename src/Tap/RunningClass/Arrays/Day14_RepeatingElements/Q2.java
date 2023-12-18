package Tap.RunningClass.Arrays.Day14_RepeatingElements;


import java.util.Scanner;

/*
   smallest Repeating Number
   input:-
   10
   2 3 3 3 4 5 7 7 9 11
   output:-
   7
* */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        largestRepeatingNumber(arr);
    }



    static void largestRepeatingNumber(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
