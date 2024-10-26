package Revision.basics;

public class Hello {
    public static void main(String args[]){
        System.out.println("Hello Krishna , From Today im going to revised ");
        int n1 = 12;
        int n2 = 12;
        System.out.println(n1 + n2);

        int num1=9;
        byte by=127;
        short sh=558;
        long l=5854l;

        float f=5.8f;
        double d=5.8;

        char c='k';

        boolean b=true;
        System.out.println(b);


        byte b1=127;
        int a=b1;
        System.out.println(b);
        System.out.println(a);

        byte b11=125;
        int a0=b11;
        System.out.println(b11);
        System.out.println(a0);

        int aa=257;
        byte k=(byte)aa;

        float f1=5.6f;
        int t=(int)f1;

        int a2=2567;
        byte b2=(byte)a2;
        System.out.println(k);

        byte a3=10;
        byte b4=20;
        int t4=a3*b4;
        System.out.println(t4);

        for(int i = 0; i<12; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int  x = 1;
        while (x <10){
            System.out.print(x+ "  ");
            x++;
        }
        System.out.println();
        int y = 1;
        do {
            System.out.print(y+" ");
            y++;
        }while (y<=10);

    }
}


/*

    For loop:-
        If you know how many iterations you want to go for loop
        (intiliazing vaue, condition, increment or decrement)

        While loop:-
        When you need to read the file go for while loop, if the number of iterations is not known.

        - For loop can also be used as a while.

        Do While Loop:-
        If you condition get false but you want to exceute the code at least once.

*/
