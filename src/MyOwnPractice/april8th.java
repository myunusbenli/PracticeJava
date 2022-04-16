package MyOwnPractice;

import java.util.Arrays;

public class april8th {
    public static void main(String[] args) {

        /*
        given array
        [-2,4,6,7,4,1,-9]
         */

        int[] arr = {-2,4,6,7,4,1,-9};
        int[] tempArray = new int[arr.length];
        int start = 0;
        int end = arr.length-1;

        for (int each : arr) {
            if(each<0){
                tempArray[start] = each;
                start++;

            }else{
                tempArray[end] = each;
                end--;
            }
        }
        System.out.println("Arrays.toString(tempArray) = " + Arrays.toString(tempArray));

    }

}
