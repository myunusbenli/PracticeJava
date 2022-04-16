package MyOwnPractice;

import java.util.HashMap;
import java.util.Map;

public class p1 {
    public static void main(String[] args) {
        /*
        let's say we are given a string
        input: AAABBCDDDEE
        OUTPUT: A3B2C1D3E2
         */

        String str = "AAABBCDDDEE";

        System.out.println(countOfEachChar(str));

        System.out.println("count(str) = " + count(str));
     /*
     - oncelikle method bize return type string verecek
     - string 0 dan sayacak her char verecek
      */
    //
    }
    public static String countOfEachChar(String str){

        //String str = "AAABBCDDDEE";

        String result = "";
        int count = 0;
        char letter = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {


            if(letter == str.charAt(i)){
                count++;

            }else{
                result = result + letter + count;
                letter = str.charAt(i);
                count = 1;
            }
        }
        return result + letter + count;

    }
    public static String count(String str){

        String finalString = "";
        Map<Character, Integer> countOfLetters = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!countOfLetters.containsKey(str.charAt(i))){
                countOfLetters.put(str.charAt(i), 1);
            }else {
                countOfLetters.replace(str.charAt(i), countOfLetters.get(str.charAt(i))+1);
            }

        }
        for (char s : countOfLetters.keySet()) {
            finalString = finalString + s + countOfLetters.get(s);

        }
        return finalString;
    }


}
