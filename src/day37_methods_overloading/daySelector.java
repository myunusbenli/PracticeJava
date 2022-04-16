package day37_methods_overloading;

public class daySelector {
    public static void main(String[] args) {
        System.out.println(weekDays(5));

    }
    public static String weekDays(int day){
        if (day==1){
            return 1+ "- Monday";
            //System.out.println(1+ "- Monday");
        }else if(day==2){
            return 2 + "- Tuesday";
            //System.out.println(2+ "- Tuesday");
        }else if(day==3){
            return 3+ "- Wednesday";
            //System.out.println(3+"- Wednesday");
        }else if(day==4){
            return 4 + "- Thursday";
            //System.out.println(4+ "- Thursday");
        }else if(day==5){
            return 5 + "- Friday";
            //System.out.println(5+ "- Friday");
        }else if(day==6){
            return 6 + "- Saturday";
            //System.out.println(6 + "- Saturday");
        }else if(day==7){
            return 7 + "- Sunday";
            //System.out.println(7 + "- Sunday");
//        }else {
//            System.out.println("Invalid day!!!");
        }
        return "Invalid day";
    }
}
