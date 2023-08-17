package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = arr.length - 1;
        int target = 8;

        int index = binarySearch(arr, left, right, target);

        System.out.println(index);
    }


    static int binarySearch(int [] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + ((right - left) / 2);

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }

        return binarySearch(arr, left, right, target);
    }
}
