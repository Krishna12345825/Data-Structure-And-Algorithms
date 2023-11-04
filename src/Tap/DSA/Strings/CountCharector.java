package Tap.DSA.Strings;
//Character count
public class CountCharector {
    public static void main(String[] args) {
         String str="Hello how are you";
         String ch="o";
         int result= countCharecter(str,ch);
        System.out.println(result);
    }
    public static int countCharecter(String str, String c){
        int count=0;
        char key =c.charAt(0);
        for (int i=0; i<str.length()-1; i++){
        if(str.charAt(i)==key){
            count++;
        }
        }
        return count;
    }
}
