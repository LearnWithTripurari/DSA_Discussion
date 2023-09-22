package Array2;

import java.util.Arrays;

public class ArrayOfProducts {

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};

       int[] res =  productExceptSelf(arr);

        System.out.println(Arrays.toString(res));

        //arr = [-1,1,0,-3,3]
        // [0, 0, 9, 0, 0]
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0] = 1;

        for(int i=1; i < nums.length; i++) {
            leftProduct[i] = nums[i-1] * leftProduct[i-1];
        }

        rightProduct[nums.length - 1] = 1;

        for(int j = nums.length - 2; j >= 0; j--) {
            rightProduct[j] = nums[j+1] * rightProduct[j+1];
        }

        for(int k = 0; k < nums.length; k++) {
            res[k] = leftProduct[k] * rightProduct[k];
        }

        return res;
    }

//    public static int[] productExceptSelf(int[] nums) {
//
//        int[] res = new int[nums.length];
//        int i = 0;
//        int product = 1;
//
//        for(int j = 0; j < nums.length && i < nums.length; j++) {
//
//                if(i != j) {
//                    product *= nums[j];
//                }
//
//                if(j == nums.length - 1) {
//                    res[i] = product;
//                    i++;
//                    product = 1;
//                    j = -1;
//                }
//
//        }
//        return res;
//    }

//    public int[] productExceptSelf(int[] nums) {
//
//        int[] res = new int[nums.length];
//
//        for(int i = 0; i < nums.length; i++) {
//
//            int product = 1;
//
//            for(int j =0; j < nums.length; j++) {
//
//                if(i != j) {
//                    product *= nums[j];
//                }
//            }
//
//            res[i] = product;
//        }
//
//        return res;
//    }
}