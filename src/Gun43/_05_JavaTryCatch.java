package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");



        try { // Dene, Hatanın bailadığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30); // RunTime Error
        } // Hata olduğu zaman programı kırma
        catch (Exception ex) // ex isimli bir değişkende hataların bilgisi atanıyor
        {
            System.out.println("Hata oluştu"+ex);
            System.out.println("ex.getMessage() = " + ex.getMessage());
            // log tutabilirsin, ekranın fotoğrafını alabilirsin
        }
        System.out.println("Program bitti");

        // Kursta ki hata yönetimleri
        try {
            // Java ve Tool'ları çalışmaya devam et
            // Konuları grupla çalışmaya devam
        } // Anlamadığın yerler mi oldu, runTime error
        catch (Exception ex){
            // Hatanın sebebini anla
            // Derse daha fazla odaklan
            // Anlamadığın yerleri sor
            // Videoları tekrar izle
            // Grup çalışmasına devam et
        }



    }
}
