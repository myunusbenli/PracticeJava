package day42_ArrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    /*
    methodName: printStrList
    param: List of Strings
    return: Void
    prints all values separated by space in same line
     */
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("java");  words.add("html");  words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");

        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

    }
    public static void printStrList(List<String> stringList){   //java, apple, coffee, tea
        for (String str : stringList){
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
