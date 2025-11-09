import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        System.out.println("Enter Numbers");
        System.out.println("Krishna ");
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int arr[]  = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        evenNumberArray(n, arr);

    }

    static void evenNumberArray(int n, int arr[]){
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }



}