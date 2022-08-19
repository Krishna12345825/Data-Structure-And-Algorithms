package lectures.methods.code;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap number code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println(a + " " + b);


        String name = "Krishna kumar";
        changename(name);

        System.out.println(name);
    }

    private static void changename(String name) {
        name = "Krishna kumay Yadav";// creating a new object
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // this change will only be valid in this function scope only
    }
}
