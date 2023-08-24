package Revision.Array;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

//        int[] reverseArr  = reverse1(arr);
//
//        System.out.println(Arrays.toString(reverseArr));
//
//        System.out.println("-------------- Approach 2-----------------");
//
//        reverse2(arr);
//
//        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------- Approach 3 ----------------------");

        reverse3(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));


        System.out.println("------------------ Reverse the digit of a number------------------");

        int reversedNum = reverseDigit(12345);

        System.out.println("reversedNum "+ reversedNum);
    }

    // Approach -1  [ T.C - o(n), S.C. - o(n) ]
    static int[] reverse1(int[] arr) {

        int[] reverseArr = new int[arr.length];

        int j = 0;

        for (int i = arr.length -1 ; i >= 0 ; i--) {
            reverseArr[j] = arr[i];
            j++;
        }

        return reverseArr;
    }




    // Approach - 2 [ T.C - o(n), S.C. - o(1) ]
    static void reverse2(int[] arr) {

        int left = 0, right = arr.length - 1;

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


    }


    // Approach - 2 (Recursion)

    static void reverse3(int [] arr, int left, int right) {

        // Base case

        if (left >= right) return;


        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call

        reverse3(arr, left+ 1, right -1);
    }


    // Reverse the digits of a number

    static int reverseDigit(int num) {

        int revNum = 0;

        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }

        return revNum;
    }
}
