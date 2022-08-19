package lectures.arrays.code;

import java.util.Arrays;

public class PassinginFunctions {

    public static void main(String[] args) {
        int[] num = {2, 45, 6, 89, 06};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
