package LeetCode.Strings.code;

public class Comparison {
    public static void main(String[] args) {
        String a = "krishna";
        String b = "krishna";
        String c = a;
        System.out.println(a == b);
        System.out.println(c == a);

        String name1 = new String("krishna");
        String name2 = new String("krishna");
        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}
