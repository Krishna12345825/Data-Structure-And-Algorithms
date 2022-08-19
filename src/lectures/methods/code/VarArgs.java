package lectures.methods.code;

import java.util.Arrays;

import static lectures.methods.code.Overloading.fun;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        multiple(2, 4, "krishna", "kumar", "Yad-av");
        demo(12);
        demo("krishna");
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }


    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {

    }


    private static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
