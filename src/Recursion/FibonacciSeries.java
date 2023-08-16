package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciSeries {

    static ArrayList<Integer> ser = new ArrayList<>(Arrays.asList(0,1));

    public static void main(String[] args) {

        long beginTime = System.nanoTime();

        int t5 = fib(5);
        System.out.println(t5);
        int t4 = fib(4);
        System.out.println(t4);

        long endTime = System.nanoTime();

        System.out.println("Time elapsed: " +(endTime - beginTime));
    }

    static int fib(int n) {

        if (ser.size() > n) {
            return ser.get(n);
        }

        // Base case
        if(n <= 1) {
            return n;
        }
        else {
            int nxtTerm = fib(n - 1) + fib(n - 2);
             ser.add(nxtTerm);
             return  nxtTerm;
        }

    }
}
