package sorting;

import java.util.Arrays;

public class QuickSortImp {

    public static void main(String[] args) {
        int[] arr = {4,5,3,7};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int [] arr, int low, int high) {

        if(low < high) {

          int pivot = partition(arr, low, high);

          quickSort(arr, low, pivot - 1);
          quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {

            while (i <= j && arr[i] <= pivot) i++;

            while (i <= j && arr[j] > pivot) j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
