package day33_arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 100};

        int[] revNums = new int[nums.length];

        for (int i = nums.length-1, j=0; i>=0;i--,j++){
            revNums[j]=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(revNums));
    }
}
