package day38;

public class ArrayUtilTest {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum +=num;
        }
        return sum;
    }
    public static boolean insideOrNot(int[] listOf, int num){
        boolean found = false;


        for (int each : listOf){
            if (each == num) {
                found = true;
                break;
            }
        }
        return found;

    }
}
