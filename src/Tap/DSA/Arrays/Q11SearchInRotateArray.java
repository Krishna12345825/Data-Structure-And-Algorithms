package Tap.DSA.Arrays;

// Search in Rotated Array leetcode: 34 (medium)
public class Q11SearchInRotateArray {
    public static void main(String[] args) {
        int arr[] ={ 4,5,6,7,8,1,2};
        System.out.println(searchRotateArray(arr,7));

    }

    public static int searchRotateArray(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            // array is sorted on the left side
            else if (nums[0] <= nums[mid]) {
                // change made here
                if (target >= nums[0] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // array is sorted on the right side
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    // change made here
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}



/*
   1. The condition for checking if the array is sorted on the left side should be nums[0] <= nums[mid],
    not nums[1] <= nums[mid]. Since the array is zero-indexed, the first element is at index 0.
   2.The condition for checking if the array is sorted on the right side should be
    nums[mid] <= nums[end], not nums[mid] <= nums[1].
*/
