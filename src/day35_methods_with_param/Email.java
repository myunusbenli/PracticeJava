package day35_methods_with_param;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firsName = scan.next();
        String companyDomain = scan.next();
        buildEmail(firsName, companyDomain);

        buildEmail("yunus BENLI", "capgemini");

    }
    public static void buildEmail(String name, String domain){

        name = name.replace(" ", "_").toLowerCase();

        domain = domain.toLowerCase();

        System.out.println(name + "@" + domain + ".com");
    }
}
