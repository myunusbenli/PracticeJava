package day30_Arrays;

import java.util.Arrays;

public class sort_And_toString {
    public static void main(String[] args) {

        int[] nums = {1,5,3,9,7,14,11};
        Arrays.sort(nums);

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
}
