package Gun06;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı örn. "Ismet Temur" I.T. şeklinde yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.print("Ad=");
        String ad= read.nextLine();
        char adIlkHarf=ad.charAt(0);
        System.out.println("Ad ilk harf= " + adIlkHarf);

        System.out.print("Soyad=");
        String soyAd= read.nextLine();
        char soyAdIlkharf=soyAd.charAt(0);
        System.out.println("Soyad ilk harf= " + soyAdIlkharf);

        System.out.println("Ad-Soyad= " +adIlkHarf+"."+"  " + soyAdIlkharf+".");











    }
}
