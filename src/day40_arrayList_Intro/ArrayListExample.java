package day40_arrayList_Intro;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);    //add a data in a order
        nums.add(7);
        nums.add(11);
        nums.add(9);
        //nums.add("java");   ERROR Because it is not RAW arraylist, it accepts only Integer type

        System.out.println("nums = " + nums);               //print

        System.out.println("size = " + nums.size());        //size

        System.out.println("nums.get(0) = " + nums.get(0));     //retrieve a data by index number

        System.out.println("nums.remove(0) = " + nums.remove(0));       //remove a data by using index number, also by object name

    }
}
