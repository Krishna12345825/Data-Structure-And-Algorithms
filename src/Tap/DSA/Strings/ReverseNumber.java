package Tap.DSA.Strings;

public class ReverseNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverseNumber(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseNumber(int []nums){
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]= temp;
            start++;
            end--;
        }

    }


}
