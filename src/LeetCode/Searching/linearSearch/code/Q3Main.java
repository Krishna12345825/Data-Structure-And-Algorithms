package LeetCode.Searching.linearSearch.code;

public class Q3Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = -11;
        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);
    }

    // search the target and return true or false
    private static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
}
