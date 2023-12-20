import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int s3 = check(s1, s2);
        System.out.println(s3);
    }
    static int check(String s1, String s2){
        int size = s2.length();
        int count = 0;
        for (int i = 0; i < s1.length() - size; i++) {
            String t = "";
            for (int j = i; j < i + size; j++) {
                t = t + s1.charAt(j);
            }
            if (t.equals(s2)){
                count++;
            }
        }
        return count;
    }
}

