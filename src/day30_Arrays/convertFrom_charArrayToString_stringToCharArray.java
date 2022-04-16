package day30_Arrays;

import java.util.Arrays;

public class convertFrom_charArrayToString_stringToCharArray {
    public static void main(String[] args) {

        //Convert from CHARARRAY to STRING

        char[] charArray = {'j', 'a','v','a',' ', 'i','s', ' ', 'f', 'u', 'n'};

        String sentence = new String(charArray);
        System.out.println("sentence = " + sentence);

        //Convert from STRING to CHARARRAY

        String quote = "java is fun";
        char[] dailyQuote = quote.toCharArray();

        System.out.println("Arrays.toString(dailyQuote) = " + Arrays.toString(dailyQuote));
    }
}
