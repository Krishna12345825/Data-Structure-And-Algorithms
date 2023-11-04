import java.util.Scanner;

class Demo {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n= scanner.nextInt();
            print1(n);
        }
        static  void print1(int n){
            for (int i = 1; i <=n ; i++) {
                for (int k = 1; k <=n -i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=i; j++) {
                    if (i==j || i==n || j==1 ){
                        System.out.print("*"+" ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

}

