package day40_arrayList_Intro;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        System.out.println("nums = " + nums);

        System.out.println("nums.size() = " + nums.size());

        nums.add(34);   nums.add(44);   nums.add(3);    nums.add(88);
        nums.add(500);  nums.add(5);    nums.add(845);  nums.add(0);
        nums.add(500);  nums.add(5);    nums.add(845);  nums.add(0);

        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);

        System.out.println("nums.remove(new Integer(88)) = " + nums.remove(new Integer(88)));
        System.out.println("nums = " + nums);

        //for loop - iterate through all values and print
        for(int i = 0; i<nums.size(); i++){
            System.out.println("nums.get(i) = " + nums.get(i));

            if (nums.get(i) ==500 || nums.get(i)==0){
                nums.remove(i);
            }
        }
        System.out.println("nums = " + nums);


        //--------------for each loop------------------------
        for(Integer each: nums){
            System.out.print(each + " ");
        }
    }
}
