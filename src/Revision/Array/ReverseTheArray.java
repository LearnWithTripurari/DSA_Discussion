package Revision.Array;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        int[] reverseArr  = reverse1(arr);

        System.out.println(Arrays.toString(reverseArr));
    }

    // Approach -1
    static int[] reverse1(int[] arr) {

        int[] reverseArr = new int[arr.length];

        int j = 0;

        for (int i = arr.length -1 ; i >= 0 ; i--) {
            reverseArr[j] = arr[i];
            j++;
        }

        return reverseArr;
    }
}
