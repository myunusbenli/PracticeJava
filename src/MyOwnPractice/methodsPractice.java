package MyOwnPractice;

public class methodsPractice {
    public static void main(String[] args) {
        name("yunus", "nur");
        mesaj();
        toplam(5,4);
        System.out.println("cikarma(15.0,5.0) = " + cikarma(15.0, 5.0));
        cikarma2(15.0,5.0);
    }
    public static void mesaj(){
        System.out.println("welcome to practice!!!");

    }
    public static void name(String name1, String name2){
        System.out.println(name1 + " - " + name2);

    }
    public static void toplam(int num1, int num2){
        System.out.println("num1 + num2 = " + (num1 + num2));

    }
    public static double cikarma(double sayi1, double sayi2){
        double eksi = sayi1 - sayi2;
        //System.out.println("eksi = " + eksi);
        return eksi;

    }
    public static void cikarma2(double sayi1, double sayi2){
        double eksi = sayi1 - sayi2;
        System.out.println("eksi = " + eksi);
        //return eksi;

    }

}
