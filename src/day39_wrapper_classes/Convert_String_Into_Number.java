package day39_wrapper_classes;

public class Convert_String_Into_Number {
    public static void main(String[] args) {

        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        System.out.println("Integer.valueOf(total) = " + Integer.valueOf(total));

        String price = "123";
        System.out.println("Integer.valueOf(price) = " + Integer.valueOf(price));

        int[] arr = {1,2,3,4,5};


    }
}
