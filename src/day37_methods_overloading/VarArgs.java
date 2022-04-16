package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(3,4,56,7);
    }
    public static void addNumbers(int... nums){
        int sum = 0;
        for (int n : nums){
            sum += sum;

        }
        System.out.println("sum = " + sum);

    }
}
