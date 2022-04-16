package MyOwnPractice;

public class inOrderOrNot {
    public static void main(String[] args) {
            int[] array = {10,20,30,40,50,60};

            int[] array2 = {60,50,40,30,20,10};
        System.out.println("getSiralimi(array) = " + getSiralimi(array));
        System.out.println("getSiralimi(array2) = " + getSiralimi(array2));

    }
    public static boolean getSiralimi(int[] sayilar){
        boolean siralimi = true;

        for (int i = 0; i < sayilar.length-1; i++){
            if (sayilar[i] < sayilar[i+1]){
                siralimi = false;
                break;
            }
        }
        return siralimi;
    }
}
