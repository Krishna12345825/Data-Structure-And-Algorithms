package Tap.DSA.Arrays;

public class Q33MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maximumSubArray1(arr);
        System.out.println(result);
    }


    // naive approach
    static  int maximumSubArray(int arr[]){
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }


    static  int maximumSubArray1(int arr[]){
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           if (sum >= 0){
               sum +=arr[i];
           }else {
               sum = arr[i];
           }
           if (sum > maxSum){
               maxSum = sum;
           }
        }

        return maxSum;
    }


}
