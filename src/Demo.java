import java.util.Scanner;


class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        checkSMallestwors(s);
    }

    static  void  checkSMallestwors(String s){
        String smallesttWord = "";
        String temproryWord = "";
        int smallestWordLength = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ' || ch == s.length()-1){
                if (temproryWord.length() < smallestWordLength){
                    smallesttWord = temproryWord;
                    smallestWordLength = temproryWord.length();
                }
                temproryWord = "";
            }else {
                temproryWord = temproryWord + ch;
            }
        }
        System.out.println(smallesttWord);
    }


}


