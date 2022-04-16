package day42_ArrayList_continue;

import java.util.Arrays;
import java.util.List;

public class sumIntergerList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(23,54,31,543,12,11,3);
        System.out.println("sumInteger(nums) = " + sumInteger(nums));

    }
    public static int sumInteger(List<Integer> list) {
        int sum = 0;
        for (int i : list){
            sum += i;
        }
        return sum;
    }


}
