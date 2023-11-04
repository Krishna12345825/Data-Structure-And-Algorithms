package Tap.DSA.Arrays;

public class Q32MaximumConsecutiveOne {
    public static void main(String[] args) {
//        int []nums = new int[]{1,1,0,1,1,1};
        int []nums = new int[]{1,0,1,1,0,1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }


    // Naive Approach
    static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]==1)
                    count++;
                else
                    break;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
