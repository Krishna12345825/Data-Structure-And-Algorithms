package lectures.linearSearch.code;

public class Q5SearchInString2 {
    public static void main(String[] args) {
        String name = "krishna";
        char target = 's';
        boolean ans1 = search2(name, target);
        System.out.println(ans1);
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
