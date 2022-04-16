package day30_Arrays;

public class startsWith_toUpperCase {
    public static void main(String[] args) {

        String[] names = {"yunus", "benli", "etka", "mehmet", "nur"};

        for(int i = 0; i<names.length; i++){
            System.out.println("names" +i +" = " + names[i].toUpperCase());
            if (names[i].startsWith("yu")){
                System.out.println("name startsWith yu");
            }else{
                System.out.println("not startWith yu");
            }
        }
    }
}
