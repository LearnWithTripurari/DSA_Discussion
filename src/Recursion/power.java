package Recursion;

public class power {

    public static void main(String[] args) {
        int res = pow(2, 5);
        System.out.println(res);
    }

    static int pow(int base, int exponent) {

        if (exponent == 0)
            return 1;

        return base * pow(base, exponent - 1);
    }
}
