package PracticeQuestion.DSA.Strings;

// Count the number of vowels in a given string
public class CountVowel {
    public static void main(String[] args) {
        String str="Krishna kumar";
        int result = countVowel(str);
        System.out.println(result);
    }
     public  static int countVowel(String str){
        int count = 0;
         for (int i = 0; i < str.length(); i++) {
             char ch= str.charAt(i);
             if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                 count++;
             }
         }
         return count;
     }
}
