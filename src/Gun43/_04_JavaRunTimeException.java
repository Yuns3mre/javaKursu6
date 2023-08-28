package Gun43;

import java.util.Scanner;

public class _04_JavaRunTimeException {
    public static void main(String[] args) {

        boolean dogruCalisti=true;
        do {
            try { // Hata bölgesine şeriti çek
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayı1=");
                int sayi1 = oku.nextInt();

                System.out.print("Sayı2=");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);
                dogruCalisti=true;

            } catch (Exception hata) // Hatay olursa yakala ve aşağıdaki bölümü çalıştır
            { // Hata mesajlarını hata isimli Exception c,ns,nden değişkene atadım
                System.out.println("Hata oluştu");
                System.out.println("Hata=" + hata.getMessage());
                System.out.println("Lütfen 2. sayıyı 0 vermeyiniz");
                dogruCalisti=false;
            }
        }while (!dogruCalisti); // Doğru Çalışmadıysa sürekli dön

    }
}
