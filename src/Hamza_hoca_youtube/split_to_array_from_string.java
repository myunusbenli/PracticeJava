package Hamza_hoca_youtube;

public class split_to_array_from_string {
    public static void main(String[] args) {

        String diller = "turkce, almanca,ingilizce,fransizca,arapca";


        String[] array = diller.split(",");

        System.out.println("array.length = " + array.length);

        System.out.println("array[0] = " + array[0]);
        System.out.println("array[0] = " + array[1]);
        System.out.println("array[0] = " + array[2]);
        System.out.println("array[0] = " + array[3]);
        System.out.println("array[0] = " + array[4]);

        System.out.println("---------------------------------------");

        String sevgi = "ben javayi seviyorum";
        String[] array1 = sevgi.split(" ");
        System.out.println("array1.length = " + array1.length);
        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array1[0] = " + array1[1]);
        System.out.println("array1[0] = " + array1[2]);

    }
}
