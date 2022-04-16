package MyOwnPractice;

public class faktoriyelHesaplama {
    public static void main(String[] args) {
        System.out.println("faktor(5)! = " + faktor(10));

    }
    public static long faktor(int sayi){
        int sonuc = 1;
        for (int i =1; i<=sayi;i++){
            sonuc *= i;
        }
        return sonuc;
    }
}
