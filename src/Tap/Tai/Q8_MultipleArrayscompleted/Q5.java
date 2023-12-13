package Tap.Tai.Q8_MultipleArrayscompleted;

import java.util.Scanner;


/*Repeated Elements in two Sorted Arrays
input1:-
6
2 4 5 5 7 8
7
2 3 5 5 6 7 8
output:-
2 5 5 7 8

input2:-
5
1 2 3 4 5
5
2 3 4 5 6

output2:-
2 3 4 5
*/



public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        sortedArray(arr1, arr2);
    }

    static void sortedArray(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length){
           if (arr1[i] == arr2[j]){
               System.out.print(arr1[i]+" ");
               i++;
               j++;
           } else if (arr1[i] < arr2[j]) {
               i++;
           }else {
               j++;
           }
        }
    }
}
