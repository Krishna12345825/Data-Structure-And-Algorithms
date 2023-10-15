package LeetCode.Sorting.code;

import java.util.Arrays;

public class Q6MergeInPlaceSort {
    public static void main(String[] args) {
        int arr[] = {856, 5, 9, 123, 18, 20};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // 1.first step
    public static void mergeSortInplace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSortInplace(arr, start, mid);

        mergeSortInplace(arr, mid, arr.length);
        mergeInPlace(arr, start, mid, end);
    }

    //2. second step
    public static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not complete
        // copy the remaining elements
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

}
