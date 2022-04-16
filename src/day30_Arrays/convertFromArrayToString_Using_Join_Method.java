package day30_Arrays;

import java.util.Arrays;

public class convertFromArrayToString_Using_Join_Method {
    public static void main(String[] args) {

        String[] languages = {"java", "phyton", "javascript", "ruby", "c++", "c#"};

        String allLanguages = String.join(" - ", languages);

        System.out.println("allLanguages = " + allLanguages);

        String together = String.join("/", languages);

        System.out.println("together = " + together);

        //-------------not join example, just a practice------------
        String str = "git";

        char[] charArray = str.toCharArray();
        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));



    }

}
