package Tap.Tai.Q6ArrayPairs;

/*
Pairs with First Value Smaller
sample input 1:-
5
3 1 5 4 2
sample output :-
3 5
3 4
1 5
1 4
1 2


sample input 2:-
3
1 2 3
sample output2 :-
1 2
1 3
2 3
*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        pairsWithSmaller(arr);
    }

    static void pairsWithSmaller(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

}
