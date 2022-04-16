package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();

        System.out.println("coffee amount = " + myCoffee.getAmount());  //0
        myCoffee.refill();

        System.out.println("amount after refill = " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("myCoffee.getAmount() = " + myCoffee.getAmount());

        myCoffee.setType("turkish coffee");
        System.out.println("my coffee = " + myCoffee.getType());
    }
}
