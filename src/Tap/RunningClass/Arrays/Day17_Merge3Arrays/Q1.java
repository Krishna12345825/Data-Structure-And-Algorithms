package Tap.RunningClass.Arrays.Day17_Merge3Arrays;

/*

Given 3 sorted arrays merge the arrays as shown below
input:-
ar1:-  2 3 4
ar2:-  5 6 7 8
ar3:-  9 10 11 12 13

output:-

res:-  2 5 9 3 6 10 4 7 11 8 12 13

*/


import java.util.Scanner;

public class Q1 {
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

       int res[] = merrgeArray(arr1, arr2, arr3);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    static int[] merrgeArray(int arr1[], int arr2[], int arr3[]){
        int res[] = new int[arr1.length + arr2.length + arr3.length];
        int i = 0;
        int k = 0;

        while (k < res.length){
            if (i < arr1.length){
                res[k] = arr1[i];
                k++;
            }
            if (i < arr2.length){
                res[k] = arr2[i];
                k++;
            }
            if (i < arr3.length){
                res[k] = arr3[i];
                k++;
            }
            i++;
        }
        return res;
    }

}
