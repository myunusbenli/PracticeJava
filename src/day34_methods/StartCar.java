package day34_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void seatInCar(){
        System.out.println("1. open the door and seat in driver seat");

    }
    public static void startTheCar(){
        System.out.println("2. insert the key to ignition and turn clockwise");

    }
    public static void shiftToDrive(){
        System.out.println("3. press brake pedal and shift to 'D'");

    }
    public static void pressGasPedal(){
        System.out.println("4. hold steering wheel with 2 hands and press gas pedal");

    }
}
