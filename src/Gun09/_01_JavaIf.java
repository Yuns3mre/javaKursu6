package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        /* Baklava Dilimi: If
          Girilen bir sayı 10'dan büyükse ekrana 10 büyük yazdırın
          1- Başla
          2- Sayı oku
          3- Sayı>10 ise "10'dan büyük " yazdır
          4- Dur
         */


        Scanner reaad=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= reaad.nextInt();

        if (sayi>10) // normal parantez şart
        {  // If'in şartı sağlandığında çalışacak olunan kısım
            System.out.println("10'dan büyük");
            System.out.println("If deyimi kullanıldı");

        }

        // 10'dan büyük olmayan değerlerde boş bırakır












    }
}
