package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(7);
        count(9);

        int num = 99;
        count(num);

        printAge(1966);
        printAge(1989);
    }
    public static void count(int num){

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2022 - year;
        System.out.println("Birth year: " + year + ". Age: " + age);
    }


}
