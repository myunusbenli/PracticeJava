package day34_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting ETSY search smoke test--");
        openBrowser();
        navigateToEtsyURL();
        searchWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("--Etsy search smoke test completed--");
    }
    public static void openBrowser(){
        System.out.println("launching chrome browser");


    }
    public static void navigateToEtsyURL(){
        System.out.println("Navigate to https://www.etsy.com/");

    }
    public static void searchWoodenSpoon(){
        System.out.println("verify etsy home page is displayed");
        System.out.println("type 'wooden spoon' in search field and click search");

    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Search results are successfully displayed");

    }
}
