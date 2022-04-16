package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        //trafficLight.color = "red";

        trafficLight.changeColor("red");

        //System.out.println(trafficLight.color);        direct access to variable not recommended
        //call method to access the variable
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.color = "black";

        trafficLight2.changeColor("brown");
        trafficLight2.showColor();
    }
}
