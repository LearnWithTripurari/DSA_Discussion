package sorting;

import java.util.Arrays;

public class MergeSortImpl {

    public static void main(String[] args) {
        int [] arr = {25, 30, 15, 10, 35};
        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int [] arr) {

        // base case
        if(arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Recursive call
        mergeSort(left);
        mergeSort(right);


        // merge the split array
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int [] left, int [] right) {

        int leftLen = left.length;
        int rightLen = right.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            }
            else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while ( i < leftLen ) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while ( j < rightLen ) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}
