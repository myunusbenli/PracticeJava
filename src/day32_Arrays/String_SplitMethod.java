package day32_Arrays;

import java.util.Arrays;

public class String_SplitMethod {
    public static void main(String[] args) {

        String words = "java/phyton/c++/c#/javascript/html/selenium";

        String[] wordsArray = words.split("/");

        System.out.println(Arrays.toString(wordsArray));

        System.out.println(wordsArray.length);

        Arrays.sort(wordsArray);

        System.out.println(Arrays.toString(wordsArray));

    }
}
