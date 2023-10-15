package LeetCode.Searching.linearSearch.code;

public class Q9SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;

        int[] ans = search(arr, target); // format of return value {row, col}
        //System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

       // System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1, -1};
    }


    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int elements : ints) {
                if (elements > max) {
                    max = elements;
                }
            }
        }
        return max;
    }

}
