import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        System.out.println("Enter the Number ");
Scanner scanner  =  new Scanner(System.in);
        int n  =  scanner.nextInt();
        int arr[] =  new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        pattern1(arr);
    }

   static  void  pattern1(int arr[]){
       for (int i = 1; i <= arr.length; i++) {
           for (int j = 1; j <= arr.length; j++) {
               System.out.print(j + " ");
           }
           System.out.println(" ");
       }
   }



}