package Tap.DSA.Arrays;

public class Q37SlidingWindowsTechnique {
    public static void main(String[] args) {
      int arr[] = {2, 9, 31, -4, 21, 7};
      int k = 3;
        System.out.println(maxSumSubArray(arr,k));
    }


    static int maxSumSubArray(int arr[], int k){
        int windowSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            windowSum +=arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maximumSum = Math.max(maximumSum, windowSum);
        }
        return maximumSum;
    }
}
