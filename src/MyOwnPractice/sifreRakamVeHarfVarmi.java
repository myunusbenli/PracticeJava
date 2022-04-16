package MyOwnPractice;

public class sifreRakamVeHarfVarmi {
    public static void main(String[] args) {
        System.out.println("sifre(\"Abc123\") = " + sifre("Abc123"));

        System.out.println("sifre(\"123\") = " + sifre("123"));

        System.out.println("sifre(\"abASD\") = " + sifre("abASD"));

    }
    public static boolean sifre(String password){
        boolean harfVarmi = false;
        boolean rakamVarmi = false;

        for (int i = 0; i < password.length(); i++){
            if (password.charAt(i) >= '0' && password.charAt(i)<='9'){
                rakamVarmi = true;
            }else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                harfVarmi = true;
            }else if(password.charAt(i)>= 'a' && password.charAt(i)<='z'){
                harfVarmi = true;
            }
        }
        boolean sonuc = rakamVarmi && harfVarmi;
        //System.out.println("sonuc = " + sonuc);

        return sonuc;
    }
}
