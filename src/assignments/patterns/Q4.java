package assignments.patterns;

/*
4.
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
*/

public class Q4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = 1;
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(k);
                }
                k++;
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
