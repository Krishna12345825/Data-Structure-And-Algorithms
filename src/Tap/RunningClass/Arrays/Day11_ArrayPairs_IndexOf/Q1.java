package Tap.RunningClass.Arrays.Day11_ArrayPairs_IndexOf;

import java.util.Scanner;

/*
   print all pairs
   input:
5
3 4 1 2 5

output:-

3 4
3 1
3 2
3 5
4 1
4 2
4 5
1 2
1 5
2 5
* */

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printAllPairs(arr);
    }

    static void printAllPairs(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }

}
