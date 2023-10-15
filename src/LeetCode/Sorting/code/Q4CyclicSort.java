package LeetCode.Sorting.code;

import java.util.Arrays;

public class Q4CyclicSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 2,1, 5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapp(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swapp(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
