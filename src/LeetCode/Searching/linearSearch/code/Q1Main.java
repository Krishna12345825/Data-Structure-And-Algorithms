package LeetCode.Searching.linearSearch.code;

public class Q1Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch1(nums, target);
        System.out.println(ans);


    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;

    }


}
