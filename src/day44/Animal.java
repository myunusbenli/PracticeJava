package day44;

public class Animal {

    String type = "some animal";


    //if we make the method static then we got to use the class name instead of object
    public void eat(){
        System.out.println("eating");
    }

    public void eat(String food){
        System.out.println("Eating" + food);
    }

    public void speak(){
        System.out.println("speaking");
    }


}
