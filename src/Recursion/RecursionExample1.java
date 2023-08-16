package Recursion;

public class RecursionExample1 {

    public static void main(String[] args) {

        printNumInReverse(5);
    }

    static void printNumInReverse(int n) {

        if(n >= 1) {
            printNumInReverse(n-1);
            System.out.println(n);
        }
    }
}
