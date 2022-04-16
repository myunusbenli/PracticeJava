package day41_ArrayList_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {

        //asList() method converts an array to arraylist

        List<Integer> nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums = " + nums);

        nums.add(100);
        System.out.println("nums = " + nums);

        //to prevent wright keep using add method to add data
        List<Integer> numsList = new ArrayList(Arrays.asList(4,3,2,23,5344,100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);

        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);
    }
}
