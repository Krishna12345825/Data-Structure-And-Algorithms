import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = split(s);
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {

            System.out.print(reverse(arr[j])+ arr[i]+" ");
        }

    }
    static String reverse(String s){
        String t = "";
        for (int i = 0; i<s.length(); i++){
            t = s.charAt(i) + t;
        }
        return t;
    }

    static String[] split(String s){
        int n = countWord(s);
        String t = "";
        int j = 0;
        String arr[] = new String[n];
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) != ' '){
                t = t + s.charAt(i);
            } else if (t.length() > 0) {
                arr[j] = t;
                j++;
                t = "";
            }
        }
        arr[j] = t;
        return arr;
    }
    static int countWord(String s){
        int count = 0;
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        return s.charAt(0)== ' ' ? count : count+1;
    }
}

