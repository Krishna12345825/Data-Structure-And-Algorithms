package Tap.DSA.Arrays;

public class Q35LongestAlternatingEvenOddSubArray {
    public static void main(String[] args) {
        int arr[] = new int[]{8,10,13,14,9,5};
        int result = longestAlternatingEvenOddSubArray(arr);
        System.out.println(result);

    }


    static int longestAlternatingEvenOddSubArray(int arr[]){
        int maxCount =0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]%2==0 && arr[j-1]%2!=0
                      || arr[j]%2!=0 && arr[j-1]%2==0){
                    count++;
                }else {
                    break;
                }
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }




    static int longestAlternatingEvenOddSubArray1(int arr[]){
        int maxCount = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]%2==0 && arr[i-1]%2!=0 ||
                    arr[i]%2!=0 && arr[i-1]%2==0){
                count++;
                maxCount = Math.max(count, maxCount);
            }else {
                count = 1;
            }
        }
        return maxCount;
    }
}
