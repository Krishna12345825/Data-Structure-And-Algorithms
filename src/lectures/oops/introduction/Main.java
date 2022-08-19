package lectures.oops.introduction;

public class Main {
    public static void main(String[] args) {
        //store 5 roll number
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];


        // data of 5 students : {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        //Students []students= new Students[5];


        // just declaring
//         Student krishna;
//        krishna= new Student();


        Student krishna = new Student(15, "krishna kumar", 85.4f);
        Student krishna1 = new Student(15, "krishna kumarbabu", 90.3f);


        krishna.rno = 13;
        krishna.name = "Kunal Kushwaha";
        krishna.marks = 88.5f;


        krishna.changeName("Shoe lover");
        krishna.greeting();

//
        System.out.println(krishna.rno);
        System.out.println(krishna.name);
        System.out.println(krishna.marks);

        Student random = new Student(krishna);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this(13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }


}

