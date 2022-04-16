package day44;

public class MyApps {
    public static void main(String[] args) {
//        String app = "uber";
//        System.out.println("app = " + app);

        App uberApp = new App();
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open();
    }
}
