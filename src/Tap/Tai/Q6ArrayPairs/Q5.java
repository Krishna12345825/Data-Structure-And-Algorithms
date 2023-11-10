package Tap.Tai.Q6ArrayPairs;

import java.util.Scanner;

/*

pair With Prime Number ELement
sample input 1:
5
2 3 5 7 9
sample output:-
2 3
2 5
2 7
2 9
3 5
3 7
3 9
5 7
5 9
7 9


sample input 2:
3
1 2 3
sample output:-
1 2
1 3
2 3

*/

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (primeNumber(arr[i])  || primeNumber(arr[j])){
                    System.out.println(arr[i]+" "+ arr[j]);
                }
            }
        }

    }

    static  boolean primeNumber(int n){
        if (n <=1){
            return false;
        }
        for (int i = 2; i < n /2; i++) {
            if (n % 2== 0){
                return  false;
            }
        }
        return true;
    }
}
