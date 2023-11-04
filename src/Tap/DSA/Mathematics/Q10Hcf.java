package Tap.DSA.Mathematics;

public class Q10Hcf {

    static void findHcf2(int a, int b) {
        int H;
        for (H=a<b?a:b; H>=1; H--) {
            if (a%H==0 && b%H==0) {
                break;
            }
        }
        System.out.println("HCF :-  "+H);
    }


    public static void main(String[] args) {
        int a=36;
        int b = 24;
        findHcf2(a, b);
    }
}
