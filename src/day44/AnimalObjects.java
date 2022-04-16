package day44;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();

        //animal.type = "cheetah";

        System.out.println(animal.type);
        animal.eat();
        animal.eat(" grass");

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
