package Gun07;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // Tek seferde girilmiş olunan ad ve soyadın, adını ve soy adını ayırıp yazdırırınız

        Scanner read=new Scanner(System.in);
        System.out.print("Adınız ve soyadınız=");
        String adSoyad= read.nextLine();

        // 0-boşluğun indexine kadar desem: adı
        // boşluğun indeksi+1 den sonuna kadar desem: soyadı verir

        int boslukIndex=adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);
        System.out.println("ad= " + ad );

        String soyAd=adSoyad.substring(boslukIndex+1);
        System.out.println("soyAd=" + soyAd );



    }
}
