package lectures.searching.linearSearch.code;

public class Q4SearchInStrings1 {
    public static void main(String[] args) {
        String name = "Krishna";
        char target = 'K';
        boolean ans = search1(name, target);

        System.out.println(ans);
        // System.out.println(search1(name,target));
        //System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
