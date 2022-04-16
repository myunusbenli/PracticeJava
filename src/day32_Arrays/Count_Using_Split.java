package day32_Arrays;

public class Count_Using_Split {
    public static void main(String[] args) {

        String nameOfCat = "cat asdas cat sdffdg cat pjjfcatfdgcatdfgdfcat";

        int count = 0;
        for (int i = 0; i<nameOfCat.length()-2; i++){
            if (nameOfCat.substring(i, i+3).equals("cat")){
                count++;
            }
        }
        System.out.println("count of cats = " + count);
    }
}
