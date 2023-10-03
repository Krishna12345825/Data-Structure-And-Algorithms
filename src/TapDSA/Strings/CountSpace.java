package TapDSA.Strings;

public class CountSpace {
    public static void main(String[] args) {
        String str=" How are you  ";
        System.out.println(countSpace(str));
    }

    public static int countSpace(String str){
        int count=0;
        String space=" ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
}
