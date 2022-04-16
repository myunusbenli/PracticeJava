package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligibility(714);
        checkEligibility(645);

        System.out.println("getCreditScore() = " + getCreditScore());

        int score = getCreditScore();
        System.out.println("score = " + score);

    }
    public static void checkEligibility(int creditScore){

        if (creditScore >= 700){
            System.out.println("you are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore(){
        return 800;
    }
}
