package lectures.arrays;

import java.util.Arrays;

import static lectures.methods.ChangeValue.change;

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
