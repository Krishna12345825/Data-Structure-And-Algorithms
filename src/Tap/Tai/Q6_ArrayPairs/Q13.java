package Tap.Tai.Q6_ArrayPairs;

import java.util.Scanner;
/*

print All Pairs
Sample input :-
4
1 2 3 4
sample output:-
1 2
1 3
1 4
2 3
2 4
3 4
Sample input :-
3
-1 0 1
sample output:-
-1 0
-1 1
0 1
*/


public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printAllPairs(arr);
    }


    static void printAllPairs(int arr[]){
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                   System.out.println(arr[i]+" "+ arr[j]);
            }
        }
    }
}
