package lectures.methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int arr[] = {12, 34, 56, 7, 9, 0};
        change(arr);
        System.out.println(Arrays.toString(args));
    }

    static void change(int[] nums) {
        nums[0] = 99;  // if you make a change to the object via this ref variable , same object will be changed
    }
}
