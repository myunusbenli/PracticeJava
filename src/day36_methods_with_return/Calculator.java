package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("add(12.3, 2.7) = " + add(12.3, 2.7));
        double sum = add(1,3);
        System.out.println("sum = " + sum);

    }
    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;

    }
    public static double minus(double num1, double num2){
        double negative = num1 - num2;
        return negative;

    }
    public static double multiply(double num1, double num2){
        double times = num1 * num2;
        return times;

    }
    public static double dividedBy(double num1, double num2){
        double dividend = num1 / num2;
        return dividend;
    }
}
