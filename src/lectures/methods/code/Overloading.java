package lectures.methods.code;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Krishna kumar");
        int ans = sum(12, 45, 12);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }


    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second name");
        System.out.println(name);
    }
}
