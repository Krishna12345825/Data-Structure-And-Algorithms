package Tap.Tai.Q6ArrayPairs;

import java.util.Scanner;

/*
Pairs with product
sample input :-
6
2 4 6 3 8 9
12

sample output:-
2 6
4 3
sample input :-
4
2 1 4 3
12
sample output:-
4 3

*/


public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        pairProduct(arr, k);
    }


    static void pairProduct(int arr[], int k){
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i] * arr[j] == k){
                    System.out.println(arr[i] +" "+ arr[j]);
                }
            }
        }
    }
}
