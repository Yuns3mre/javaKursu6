package Gun30._03_Soru;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {

        int gun=0;
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("Gun="); gun= oku.nextInt();
        System.out.print("Saat="); saat= oku.nextInt();
        System.out.print("Dakika="); dak= oku.nextInt();

        int toplamSaniye=
                gun
                * Sabitler.birGundekiSaatSayisi
                * Sabitler.birSaattekiDakikaSayisi
                * Sabitler.birSaattekiSaniyeayisi
                +
                saat
                * Sabitler.birSaattekiDakikaSayisi
                * Sabitler.birSaattekiSaniyeayisi
                +
                 dak
                * Sabitler.birSaattekiSaniyeayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);
        
        // 2. Yöntem 
        System.out.println("Sabitler.hesapla(gun,saat,dak) = "
                + Sabitler.hesapla(gun,saat,dak));





    }
}
