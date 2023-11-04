package Tap.DSA.Strings;

public class IsPalidrome {
    public static void main(String[] args) {
        String sr="LeveL";
        System.out.println(isPalidrome(sr));
    }
    public static boolean isPalidrome(String str){
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
