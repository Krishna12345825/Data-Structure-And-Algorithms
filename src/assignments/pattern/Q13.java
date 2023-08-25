package assignments.pattern;

public class Q13 {
    public static void main(String[] args) {
        int k;
        for (int i = 1; i < 5; i++) {
            k=1;
            for (int j = 1; j < 9; j++) {
                if (j>=6-1 && j<=4+i && k==1){
                    System.out.print("*");
                    k=0;
                }else {
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println();
        }
    }
}
