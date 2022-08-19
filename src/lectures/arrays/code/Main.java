package lectures.arrays.code;

public class Main {
    public static void main(String[] args) {
        //Q: store roll number
        int a = 19;

        //Q: store a person's name
        String name = "Krishna kumar";

        //Q: Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno = 15;


        // syntax
        // datatype[] variable_name= new datatype[size];
        //store 5 roll numbers;
        // int []rnos= new int[5];
        // or directly
        //  int arr[]={23,45,678,99};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for (String element : arr) {
//            System.out.println(element);
    }
}
