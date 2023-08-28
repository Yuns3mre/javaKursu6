package Gun10;

import java.util.Scanner;

public class _00_JavaIf {
    public static void main(String[] args) {

        // kullanıcıdan 2 kez gireceği şifresinin aynı olup olmadığını aynı veya aynı değil şeklinde cevaplayınız

        Scanner read=new Scanner(System.in);

        System.out.print("şifre=");
        String sifre= read.nextLine();

        System.out.print("şifre tekrar=");
        String sifreTekrar=read.nextLine();

        if (sifre.equals(sifreTekrar)) {
            System.out.println("Şifreler eşit");
        }

        if (!(sifre.equals(sifreTekrar))) {
            System.out.println("Şifreler eşit değil");
        }

















    }
}
