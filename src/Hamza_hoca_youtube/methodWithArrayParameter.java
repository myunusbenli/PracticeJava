package Hamza_hoca_youtube;

public class methodWithArrayParameter {
    public static void main(String[] args) {
        int[] list = {123, 234, 345};
        int number = 3457;
        varmi(list, number);

    }
    public static void varmi(int[] array, int searchingNumber){
        boolean result = false;
        for(int arananSayi : array){
            if(arananSayi == searchingNumber){
                result = true;
                break;
            }
        }
        System.out.println("result = " + result);
    }
}
