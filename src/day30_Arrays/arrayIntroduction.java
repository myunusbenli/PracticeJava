package day30_Arrays;

public class arrayIntroduction {
    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0]=123;
        nums[1]=345;
        nums[2]=789;
        nums[3]=897;
        nums[4]=674;

        System.out.println(nums[0]);

        System.out.println(nums.length);

        if (nums.length==5){
            System.out.println("length is 5");
        }else {
            System.out.println("length is not 5");
        }
    }
}
