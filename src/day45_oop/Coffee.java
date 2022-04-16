package day45_oop;

public class Coffee {

    int amount;
    String type;

    public void refill(){
        amount = 100;
    }
    public void drink(int someAmount){
        amount -= someAmount;
    }

    public int getAmount(){
        return amount;
    }

    public void setType(String newType){
        type = newType;
    }

    public String getType(){
        return type;
    }
}
