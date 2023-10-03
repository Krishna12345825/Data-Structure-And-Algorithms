package TapDSA.Strings;
// Print Longest non repeating substring

public class LogestNonRepeatingSubString {
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static String printLongestPalinSubstring(String st) {
        int n = st.length();
        String res = "";
        for (int len = 1; len < n; len++) {
            for (int s = 0; s <= (n - len); s++) {
                String temp = "";
                for (int e = s; e <= (s + len) - 1; e++) {
                    temp = temp + st.charAt(e);
                }
                if (isPalindrome(temp)) {
                    if (temp.length() > res.length())
                        res = temp;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "centurionunivercity";
        System.out.println(printLongestPalinSubstring(s));
    }

}
