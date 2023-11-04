package Tap.DSA.Strings;

public class Pangram {
    static boolean isPangram(String s) {
        String t = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.indexOf(t.charAt(i)) >= 0)
                count++;
            else
                break;
        }
        if (count == 26)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s = "tapacademy";
        System.out.println(isPangram(s));
    }
}
