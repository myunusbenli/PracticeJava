package day41_ArrayList_methods;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArraylist {
    public static void main(String[] args) {

        //cars list
        List<String> myCars = new ArrayList<>();

        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        //change index 0("jeep") to lamborghini
        myCars.set(0, "lamborghini");
        //change index 4("mazda") to "honda"
        myCars.set(4, "honda");
    }
}
