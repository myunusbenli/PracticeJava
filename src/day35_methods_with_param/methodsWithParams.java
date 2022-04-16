package day35_methods_with_param;

public class methodsWithParams {
    public static void main(String[] args) {
        displayValue(7);
        displayValue(13);

        int count = 55;
        displayValue(count);

        greetByName("yunus");
    }
    public static void displayValue(int num){
        System.out.println("value is " + num);
    }

    public static void greetByName(String name){
        System.out.println("Hello " + name + " , how are you today?");
    }
}
