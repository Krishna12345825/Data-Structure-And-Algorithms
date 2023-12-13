package Tap.Tai.Q8_MultipleArrayscompleted;

import java.util.Scanner;

/*
Array Merger (Three Arrays)

input1:-
3
1 2 3
4
4 5 6 7
2
8 9
output1:
Merged array: 1 2 3 4 5 6 7 8 9

input2:-
2
5 2
3
1 5 2
4
3 2 5 4
output2:-
Merged array: 5 2 1 5 2 3 2 5 4

*/


public class Q2 {


    static int[] arrayMerger(int arr1[], int arr2[], int arr3[]){
        int result[] = new int[arr1.length + arr2.length + arr3.length];
        int i = 0;
        int j = 0;
        int k = 0;
        int m = 0;

        while (i < arr1.length){
            result[m] = arr1[i];
            m++;
            i++;
        }

        while (j < arr2.length){
            result[m] = arr2[j];
            m++;
            j++;
        }

        while (k < arr3.length){
            result[m] = arr3[k];
            m++;
            k++;
        }
        System.out.print("Merged array: ");
        return result;
    }

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

        int n3 = scanner.nextInt();
        int arr3[] = new int[n3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = scanner.nextInt();
        }

       int result[] = arrayMerger(arr1, arr2, arr3);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
