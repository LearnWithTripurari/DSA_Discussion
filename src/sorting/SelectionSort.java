package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {12,5,13,7,10,20,22};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIdx = i;

            for (int j = i+1; j < arr.length ; j++) {

                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swapping
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }


        System.out.println(Arrays.toString(arr));
    }


}
