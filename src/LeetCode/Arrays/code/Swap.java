package LeetCode.Arrays.code;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 45, 67, 90, 65};
        // swap(arr,0,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
