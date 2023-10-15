package LeetCode.Searching.linearSearch.code;

public class Q8FindMax {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 14, 28};
        int ans = max(arr);
        System.out.println(ans);
    }

    // assume arr.length=!0
    // return the minimum value in the array
    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
