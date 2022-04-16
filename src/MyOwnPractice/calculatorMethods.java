package MyOwnPractice;

public class calculatorMethods {
    public static void main(String[] args) {
        System.out.println("toplam(10,5) = " + toplam(10, 5));
        System.out.println("cikarma(10,5) = " + cikarma(10, 5));
        System.out.println("bolme(10,5) = " + bolme(10, 5));
        System.out.println("carpma(10,5) = " + carpma(10, 5));

    }
    public static double toplam(double num1, double num2){
        double arti = num1 + num2;
        return arti;
    }
    public static double cikarma(double num1, double num2){
        double eksi = num1 - num2;
        return eksi;
    }
    public static double bolme(double num1, double num2){
        double bolu = num1 / num2;
        return bolu;
    }
    public static double carpma(double num1, double num2){
        double carpi = num1 * num2;
        return carpi;
    }
}
