package day38;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {

        int[] arrayPractice = {1,2,3,4,7,5,6,9,8};
        Arrays.sort(arrayPractice);
        methodWithArrayParam(arrayPractice);

        System.out.println("ArrayUtilTest.sum(arrayPractice) = " + ArrayUtilTest.sum(arrayPractice));

        System.out.println("ArrayUtilTest.insideOrNot(arrayPractice, 50) = " + ArrayUtilTest.insideOrNot(arrayPractice, 5));

    }
    public static void methodWithArrayParam(int[] array){
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
