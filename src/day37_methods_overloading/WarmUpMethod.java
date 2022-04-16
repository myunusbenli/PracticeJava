package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekstudent", "aBC123");

        System.out.println(login("cyBERTEKstudent", "ABC123"));

    }
    public static void loginVoid(String userName, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword)) {
            System.out.println("Login successful, welcome CybertekStudent!");

        }else {
            System.out.println("Incorrect username or password");
        }
    }
    public static boolean login(String userName, String password){
        String secretUsername1 = "cybertekStudent";
        String secretPassword1 = "abc123";

        if (userName.equalsIgnoreCase(secretUsername1) && password.equalsIgnoreCase(secretPassword1)){
            return true;

        }else {
            return false;
        }
    }
}
