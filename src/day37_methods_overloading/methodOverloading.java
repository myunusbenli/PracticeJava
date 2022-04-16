package day37_methods_overloading;

public class methodOverloading {
    public static void main(String[] args) {
        sum("1", "2");

    }
    public static void sum(int num1, int num2){
        System.out.println("sum(int num1, int num2");
        System.out.println("result = " + (num1 + num2));
    }
    public static void sum(double num3, double num4){
        System.out.println("sum(double num3, double num4)");
        System.out.println("result = " + (num3 + num4));

    }
    public static void sum(int num5, int num6, int num7){
        System.out.println("sum(int num5, int num6, int num7)");
        System.out.println("result = " + (num5 + num6 + num7));

    }public static void sum(String num8, String num9){
        System.out.println("sum(String num8, String num9)");
        System.out.println("result = " + num8 + num9);

    }
}
