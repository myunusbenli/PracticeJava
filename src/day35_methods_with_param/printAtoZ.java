package day35_methods_with_param;

public class printAtoZ {
    public static void main(String[] args) {
        printFromAtoZ();

        for (int i = 1; i <= 100; i++) {
            printFromAtoZ();

        }

    }
    public static void printFromAtoZ(){
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
