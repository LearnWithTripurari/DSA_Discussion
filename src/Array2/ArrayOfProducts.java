package Array2;

import java.util.Arrays;

public class ArrayOfProducts {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

       int[] res =  productExceptSelf(arr);

        System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        int i = 0;
        int product = 1;

        for(int j = 0; j < nums.length && i < nums.length; j++) {

                if(i != j) {
                    product *= nums[j];
                }

                if(j == nums.length - 1) {
                    res[i] = product;
                    i++;
                    product = 1;
                    j = -1;
                }

        }
        return res;
    }
}