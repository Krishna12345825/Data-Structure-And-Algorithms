package TapDSA.Recursion;

public class ReverseString {
    public static void main(String[] args) {

        String s="Krishna";
        System.out.println(reverseString(s,"", s.length()-1));
    }
    static String reverseString(String s, String revers, int i){
        if(i<0){
            return revers;
        }
        return reverseString(s,revers+s.charAt(i),i-1);
    }
}
