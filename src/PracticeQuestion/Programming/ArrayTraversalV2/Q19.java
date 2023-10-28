package PracticeQuestion.Programming.ArrayTraversalV2;

/*
Even Elements Sum
        Write a program to find the sum of all even elements present in an array.

        Input Format
        First line contains a single integer N. Next line contains N space separated integer values.

        Output Format
        Print sum of all even elements in an array.

        Sample Inputs & Outputs
        Sample Input 1
        5
        1 4 6 3 10
        Sample Output 1
        20
        Sample Input 2
        6
        1 2 3 4 5 6
        Sample Output 2
        12
*/


import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum  = evenElementSum(arr);
        System.out.println(sum);
    }

    static int evenElementSum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 ==0){
                sum +=arr[i];
            }
        }
        return sum;
    }
}
