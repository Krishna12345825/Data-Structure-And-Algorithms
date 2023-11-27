package Tap.RunningClass.Strings;



public class Day1 {

    // Q1. Given the String count the of spaces
    // Input :- How are you
   //    OutPut :- 2
    static  int countSpaces(String s){
        int count  = 0;
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' '){
                count++;
            }
        }
        return  count;
    }


    //Q2. Given a String count the number of words
    static int countWords(String s){
        int count  = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!=' ' && s.charAt(i + 1)!=' '){
                count++;
            }
        }
        return s.charAt(0)!=' '?count : count+1;
    }


    public static void main(String[] args) {
        String s = "How are you  ";
//        int ans = countSpaces(s);
        int ans = countWords(s);
        System.out.println(ans);
    }
}
