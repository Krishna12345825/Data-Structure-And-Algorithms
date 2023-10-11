package PracticeQuestion.DSA.Mathematics;

public class Q6SievePrimePrints {
    public static void main(String[] args) {
        int n= 13;
        sievePrimePrints(n);
    }

    public static void sievePrimePrints(int n){
        boolean[] prime = new boolean[n+1];
        for (int i =2; i*i<=n; i++) {
            if (prime[i]==false){
                for (int j = i*i; j <=n ; j=j+i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if (prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
