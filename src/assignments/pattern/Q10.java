package assignments.pattern;

/*
10.
            *
           * *
          * * *
         * * * *
        * * * * *

*/


public class Q10 {
    public static void main(String[] args) {
        int k,i,j;
        for ( i = 1; i <= 5; i++) {
            k = 1;
            for ( j = 1; j <= 9; j++) {
                if (j >=6-i && j<=4+i && k==1) {
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

