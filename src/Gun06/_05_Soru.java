package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        // Girilen bir Sitringin sadece son harfini yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.print("Kelime=");
        String kelime= read.next();

        int uzunluk=kelime.length();
        char sonHarf=kelime.charAt(uzunluk-1);
        System.out.println("son Harf= " + sonHarf);
















    }
}
