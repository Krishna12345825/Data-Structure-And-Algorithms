package assignments.First_Java.code;

//8. To find out whether the given String is Palindrome or not.
//9. To find out whether the given Number is Palindrome or not.
public class Q8 {
    public static void main(String[] args) {
        String str="kanak";
        if (palidromeString(str)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }


        int nums=123;
        if (isPalidromeNumber(nums)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean palidromeString(String str){
        int start=0;
        int end= str.length()-1;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    public static boolean isPalidromeNumber(int num){
        String str=Integer.toString(num);
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
