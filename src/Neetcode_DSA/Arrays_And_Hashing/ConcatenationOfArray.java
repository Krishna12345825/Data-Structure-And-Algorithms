package Neetcode_DSA.Arrays_And_Hashing;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
      //  int nums[] = new int[]{1, 4, 1};
        int nums[] = new int[]{1, 4, 1, 2};
        int[] nums1 = getConcatenation(nums);

        System.out.print(Arrays.toString(nums1));
    }

    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }

        return ans;
    }
}

/*

https://leetcode.com/problems/concatenation-of-array/


Concatenation of Array

You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Example 1:

Input: nums = [1,4,1,2]

Output: [1,4,1,2,1,4,1,2]
Example 2:

Input: nums = [22,21,20,1]

Output: [22,21,20,1,22,21,20,1]
Constraints:

1 <= nums.length <= 1000.
1 <= nums[i] <= 1000


 */