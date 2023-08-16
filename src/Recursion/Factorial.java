package Recursion;

public class Factorial {

    public static void main(String[] args) {

        int factNo = fact(5);

        System.out.println(factNo);
    }

    static int fact(int n) {

        if(n==0 || n == 1)
            return 1;

        return n * fact(n-1);
    }
}
