package PracticeQuestion.DSA.Strings;
// Word Count program
public class WordCount {
    public static void main(String[] args) {
        String str="How are you ";
        System.out.println(wordCount(str));
    }

    public static int wordCount(String str){
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
}
