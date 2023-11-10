package Tap.Tai.Q6ArrayPairs;

import java.util.Scanner;
/*

Pairs with Sum k
Sample input :-
5
1 2 3 4 5
6
sample output:-
1 5
2 4
Sample input :-
5
4 2 3 5 7
7
sample output:-
4 3
2 5
*/


public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        pairsWithSumK(arr, k);
    }


    static void pairsWithSumK(int arr[], int k){
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
               if (arr[i] + arr[j] == k){
                   System.out.println(arr[i]+" "+ arr[j]);
               }
            }
        }
    }
}
