package Tap.Tai.SubArrays;

import java.util.Scanner;

/*

Sum Of SubArrays Of size K
input:
3
5
1 2 3 4 5
output:-
6 9 12

*/




public class Q2 {


    static void sumOfSizeK(int size, int arr[]){
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }
            System.out.print(sum + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        sumOfSizeK(size, arr);
    }
}
