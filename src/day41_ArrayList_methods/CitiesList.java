package day41_ArrayList_methods;

import java.util.ArrayList;
import java.util.List;

public class CitiesList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        cities.add("Vienna");
        //how to add a data in very first index
        cities.add(0, "Ashgabat");

        System.out.println("cities = " + cities);

        System.out.println("firstcity = " + cities.get(0));
        System.out.println("last size = " + cities.get(cities.size()-1));

        cities.remove(3);
        System.out.println("cities.lastIndexOf(\"Vienna\") = " + cities.lastIndexOf("Vienna"));

        //delete or remove all values
        cities.clear();
    }
}
