package Tap.DSA.Arrays;

//leetcode.com/problems/majority-element/description/

public class Q34MajorityElement {
    public static void main(String[] args) {
        int arr[] = new int[]{2,2,1,1,1,2,2};
        int result = majorityElement(arr);
        System.out.println(result);
    }


   static int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = i+1; j < n; j++) {
                if (nums[j] == nums[i]) {
                    cnt++;
                }
            }
            if (cnt > (n/ 2))
                return nums[i];
        }
        return -1;
    }


    static int majorityElement1(int[] arr) {
        int majority = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majority){
                count++;
            }else {
                count--;
            }
            if (count==0){
                majority = arr[i];
                count = 1;
            }
        }
        return  majority;
    }

}
