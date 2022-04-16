package day38;

public class print_from_0_to_100_without_loop {
    public static void main(String[] args) {
        printNums(1);
    }
    public static void printNums(int num){
        System.out.print(num + " ");
        num++;
        if(num<=100) {
            printNums(num);
        }
    }
}
