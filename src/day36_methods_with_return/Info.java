package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("fullName() = " + fullName());
        System.out.println("isMarried() = " + isMarried());
        System.out.println("getAge() = " + getAge());

        System.out.println("getRandomYear() = " + getRandomYear());
    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
