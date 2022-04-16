package day34_methods.callFirstMethod;

public class firstMethod {
    public static void main(String[] args) {
        displayMessage();
        numbers(4);

        for(int i = 1; i<=100;i++){
            System.out.print(i + " - ");
            displayMessage();
        }

    }

    public static void displayMessage(){
        System.out.println("Hello B22 Friends");
    }
    public static void numbers(int num){
        int nums = 3;
        System.out.println("num + nums = " + (num+nums));
    }
}
