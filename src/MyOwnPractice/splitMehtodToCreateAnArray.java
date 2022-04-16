package MyOwnPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class splitMehtodToCreateAnArray {
    public static void main(String[] args) {

        String cities = "istanbul, new york, houston, austin, dallas";

        //List<String> arrList = new ArrayList<>();
        String[] arr = cities.split(", ");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("each city = " + arr[i]);

        }

    }
}
