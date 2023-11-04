package Tap.DSA.Strings;
// Print substring of length 3
public class PrintSubStringLength3 {
    public static void main(String[] args) {
        String s = "Krishna";
        int k = 3;
        subStringLength(s,k);
    }

    public static void subStringLength(String st, int k){
        int n = st.length();
        for (int s = 0; s <= (n - k); s++) {
            for (int e = s; e <= (s + k) - 1; e++) {
                System.out.print(st.charAt(e)+" ");
            }
            System.out.println();
        }

    }
}
