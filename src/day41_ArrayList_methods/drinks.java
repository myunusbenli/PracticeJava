package day41_ArrayList_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class drinks {
    public static void main(String[] args) {

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew"));

        drinksWithCaffeine.add("kambucha");
        drinksWithCaffeine.add("celsius");
        System.out.println("drinksWithCaffeine = " + drinksWithCaffeine);

        int caffeineAmount = 0;

        for (String drink : drinksWithCaffeine){
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink+ "--> " + caffeineAmount);
            }else if(drink.equals("coffee")||drink.equals("kambucha")){
                caffeineAmount = 120;
                System.out.println(drink+ "--> " + caffeineAmount);
            }else if (drink.equals("tea")||drink.equals("coke")||drink.equals("pepsi")||drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink+ "--> " + caffeineAmount);
            }

        }
    }
}
