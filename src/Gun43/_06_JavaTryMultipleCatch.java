package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program başladı");
        try {
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayı1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayı2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

//            String kelime=""; Genel hataya düşmesi için yapıldı
//            kelime.charAt(3);



        }catch (ArithmeticException ex){ // Belirli bir hata için : Case
            System.out.println("Sıfıra bölme hatası oluştu");
        }

        catch (InputMismatchException ex){ // Belirli bir hata : Case
            System.out.println("Lütfen geçerli bir değer giriniz");
        }

        catch (Exception ex){ // Genel hata switch'deki default gibi
            System.out.println("Sıfıra bölme hatası oluştu");
        }

        System.out.println("Beklenmeyen hata oluştu");
    }
}
