package Revision.Array;

public class FindMaxMinEle {

    public static void main(String[] args) {

        int [] arr = {5,1,6,7,2,4,3};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

//            max = Math.max(arr[i], max);
//            min = Math.min(arr[i], min);

        }

        System.out.println(max);
        System.out.println(min);


    }
}
