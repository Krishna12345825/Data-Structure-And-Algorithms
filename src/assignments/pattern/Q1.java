package assignments.pattern;

/*1.    *****
 *****
 *****
 *****
 *****    */



public class Q1 {
    public static void main(String[] args) {
        pattern1(5);
    }

    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>=1 && j<=5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
