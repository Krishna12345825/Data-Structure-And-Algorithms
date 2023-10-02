package TapDSA.Strings;
//String Reverse
public class ReverseString {
    public static void main(String[] args) {
        String s="krishna";
//       String result = reverString(s);
//        System.out.println(result);
//        System.out.println(reverseString1(s));
        System.out.println(reverseString1(s));
    }
    public  static String reverString(String str){
        String s="";
        for (int i=str.length()-1; i>=0; i--){
           s=s+ str.charAt(i);
        }
        return s;
    }


    public static String reverseString1(String str){
        char []temp= str.toCharArray();
        int start=0;
        int end= str.length()-1;
        while (start<=end){
            char temp1=temp[start];
            temp[start]= temp[end];
            temp[end]=temp1;
            start++;
            end--;
        }
        return new String(temp);
    }




}
