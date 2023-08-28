package Gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {

        // Giilen yeni bir password'ün kurallara uygunluğunu kontrol ediniz
        // Kurallar:
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı
        // Kurallara uygun veya değil diye belirtiniz


        Scanner read=new Scanner(System.in);
        System.out.print("Paswoord=");
        String password= read.nextLine();

        if (password.length()>=8 && !(password.toLowerCase().contains("pass")) && password.length()<=12 )
            System.out.println("Şifre uygun");
        else
            System.out.println("Şifre uygun değil");















    }
}
