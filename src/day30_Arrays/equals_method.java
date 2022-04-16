package day30_Arrays;

import java.util.Arrays;

public class equals_method {
    public static void main(String[] args) {

        String[] name1 = {"yunus", "etka", "nur"};
        String[] name2 = {"yunus", "etka", "nur"};
        String[] name3 = {"yunus", "nur", "etka"};

        System.out.println("Arrays.equals(name1, name2) = " + Arrays.equals(name1, name2));   //true

        System.out.println("Arrays.equals(name1, name3) = " + Arrays.equals(name1, name3));   //false

        System.out.println("name1 == name2: " + (name1 == name2));     //false


    }
}
