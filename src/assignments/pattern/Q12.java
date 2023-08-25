package assignments.pattern;

/*

 12.       * * * * *
            * * * *
             * * *
              * *
               *
               *
              * *
             * * *
            * * * *
           * * * * *


*/

public class Q12 {
    public static void main(String[] args) {
        int k;
        for (int i = 1; i <= 5; i++) {
            k = 1;
            for (int j = 1; j <= 9; j++) {
                if (j>=i && j<=10-i && k==1  || j >=6-i && j<=4+i && k==1 ) {
                    System.out.print("*");
                    k = 0;
                } else {
                    System.out.print(" ");
                    k=1;
                }
            }
            System.out.println();
        }
    }
}
