package day40_arrayList_Intro;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList();

        System.out.println("shoppingList.size() = " + shoppingList.size());

        System.out.println("shoppingList.isEmpty() = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("shoppingList.isEmpty() is empty");
        }else{
            System.out.println("not empty");
        }

        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("shoppingList.isEmpty() is empty");
        }else{
            System.out.println("not empty");
        }

        int count = shoppingList.size();
        System.out.println("items to buy = " + count);

        System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));
    }
}
