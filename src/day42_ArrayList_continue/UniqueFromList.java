package day42_ArrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println(nums);
        List<Integer> uniqueList = new ArrayList<>();
        for (int each : nums){
            if (Collections.frequency(nums, each) == 1){
                System.out.print(each + " ");
                uniqueList.add(each);
            }
        }
        System.out.print("\nuniqueList = " + uniqueList);
    }
}
