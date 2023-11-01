package PracticeQuestion.DSA.Mathematics;

public class Q9LCM {

    static void findLcm1(int a, int b) {
        int i;
        for ( i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                break;
            }
        }
        System.out.println(i);
    }

    static void findLcm2(int a, int b) {
        int i;
        for (i=a>b?a:b; i<=a*b; i++) {
            if (i%a==0 && i%b==0) {
                break;
            }
        }
        System.out.println("LCM :-  "+i);
    }


    static void findLcm3(int a, int b) {
        int i;
        for (i=a>b?a:b; i<=a*b; i=i+(a>b?a:b)) {
            if (i%a==0 && i%b==0) {
                break;
            }
        }
        System.out.println("LCM :-  "+i);
    }
    public static void main(String[] args) {
        int a=4;
        int b = 5;
        findLcm3(a, b);
    }
}
