package MyOwnPractice;

public class paliondram {
    public static void main(String[] args) {
        String str = "Racecar";
        String emptyStr = "";

        for (int i = str.length()-1; i >=0; i--){
            emptyStr += str.charAt(i);
        }
        System.out.println("emptyStr = " + emptyStr);

        //Boolean check = true;

        if (emptyStr.equalsIgnoreCase(str)){
            System.out.println("they are same");
        }else {
            System.out.println("not same");
        }
    }
}
