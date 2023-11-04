package Tap.DSA.Recursion;

public class Palidrom {
    public static void main(String[] args) {
        String s= "KAKA";
        System.out.println(palidrom(s,0,s.length()-1));

    }
    public  static boolean palidrom(String s, int i, int j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        if (i<=j){
            return true;
        }
        return palidrom(s,i+1, j-1);
    }
}
