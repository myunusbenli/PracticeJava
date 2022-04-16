package day40_arrayList_Intro;

import java.util.*;


public class RawArrayList {
    public static void main(String[] args) {

        //arrayList is a class in java, that is store multiple sets of data like array.
        //1- it keeps index ordering
        //2- it allows duplicated values
        //3- ArrayList uses Arrays internally

        //DECLARE ARRAYLIST

        //2 Ways
        ArrayList list = new ArrayList();
        List list2 = new ArrayList();

        //add data to arraylist         //default capacity of arraylist is 10 but it is not limited to 10.

        list.add("java");
        list.add("apples");
        list.add("coffee");
        list.add(1234);
        list.add(55.2);
        list.add(true);
        list.add("wooden spoon");

        System.out.println(list);
        System.out.println("list.size() = " + list.size());

        //raw arraylist(without param) is recommended
        //List list = new ArrayList();

        //Restricted (recommended)
        ArrayList<Integer> nums = new ArrayList<>();

        //RAW Not Recommended
        ArrayList nums1 = new ArrayList();


    }
}
