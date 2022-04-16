package day39_wrapper_classes;

import java.util.Arrays;

public class WrapperClasses {
    public static void main(String[] args) {

        int num = 100;
        Integer newNum = num;

        Integer n = new Integer(500);

        String letter = num + "";    //or
        String letter1 = newNum.toString();

        int[] arr = {1,2,3,4,5,6,7};

        System.out.println("Integer.max(10,5) = " + Integer.max(10, 5));
        System.out.println("Integer.sum(10,5) = " + Integer.sum(10, 5));

        System.out.println("Integer.min(10,5) = " + Integer.min(10, 5));
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Character.isDigit('7') = " + Character.isDigit('7'));
        System.out.println("Character.isAlphabetic('A') = " + Character.isAlphabetic('A'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));
        System.out.println("Character.isLetterOrDigit('b') = " + Character.isLetterOrDigit('b'));


    }
}
