import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        int n1 = scanner.nextInt();
//        int arr1[] = new int[n1];
//        for (int i = 0; i < arr.length; i++) {
//            arr1[i] = scanner.nextInt();
//        }
        countElement(arr);
    }
    // arr1[i]%2==0 &&
    static  void  countElement(int arr1[]) {
        int i = 0, j = 0;
        while (i < arr1.length ){
           if (arr1[i] == 0){
               i++;
           }else {
               arr1[j] = arr1[i];
               i++;
               j++;
           }

        }
        while (j < arr1.length){
            arr1[j] = 0;
            j++;
        }
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k]+" ");
        }

    }

}

