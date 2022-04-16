package day42_ArrayList_continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed letters = " + letters);

        Collections.frequency(letters, 'a');
        System.out.println("frequency of 'a' = " + Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters,'a', 'u');
        Collections.replaceAll(letters,'i','j');
        System.out.println("after replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("after sort = " + letters);

        //-------------------------------------------------------

        List<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0);
        System.out.println("nums = " + nums);

        Collections.reverse(nums);
        System.out.println("nums = " + nums);

        Collections.reverseOrder();
        System.out.println("nums = " + nums);

        Collections.shuffle(nums);
        System.out.println("nums = " + nums);

    }
}
