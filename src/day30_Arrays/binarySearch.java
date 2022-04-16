package day30_Arrays;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        int[] nums = {12,43,54,67,87,49,91};

        //we need to sort the array before we use binarySearch

        //binarySearch gives us index number of the searched data

        Arrays.sort(nums);

        System.out.println("Arrays.binarySearch(nums, 12) = " + Arrays.binarySearch(nums, 49));
    }
}
