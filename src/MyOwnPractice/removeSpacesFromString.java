package MyOwnPractice;

import java.util.Arrays;

public class removeSpacesFromString {
    public static void main(String[] args) {

        String str = "asdasd            asdsdg     fgh     eerw     hfgh";

        System.out.println("newStr.replaceAll(\" \", \"\") = " + str.replaceAll(" ", ""));


        String[] arr = str.split(" ");

        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        String newStr = "";
        for (int i = 0; i < arr.length; i++) {

            if (!arr[i].equals(" ")){
                newStr += arr[i];
            }

        }
        System.out.println("newStr = " + newStr);

        StringBuffer bufferStr = new StringBuffer();
        bufferStr.append(newStr);


    }
}
