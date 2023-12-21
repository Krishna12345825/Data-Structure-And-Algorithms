import java.util.Arrays;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insersionSOort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insersionSOort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }


}

