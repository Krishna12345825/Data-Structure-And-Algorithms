package Tap.Tai.Q6ArrayPairs;

/*
Pairs with First Value Smaller
sample input 1:-
5
4 9 2 7 5
sample output :-
4 9
4 7
4 5
2 7
2 5


sample input 2:-
3
1 2 3
sample output2 :-
1 2
1 3
2 3
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        pairsWithLarger(arr);
    }

    static void pairsWithLarger(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

}
