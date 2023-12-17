import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String   s1 = scanner.nextLine();
        String   s2 = scanner.nextLine();
        System.out.println(stringEquals(s1, s2));
    }

    static boolean stringEquals(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int i = 0;
        while (i < s1.length()){
            if (s1.charAt(i) == s2.charAt(i)){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }

    static void printSubString(String s){
        for (int size = s.length(); size >=0; size--){
            for (int i = 0; i <s.length() - size; i++){
                String t = "";
                for (int j = i; j<= i+size; j++){
                   t = t+s.charAt(j);
                }
                if (isPalindrome(t)){
                    System.out.println(t);
                    return;
                }
            }
        }
    }

    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while (i <= j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }



}

