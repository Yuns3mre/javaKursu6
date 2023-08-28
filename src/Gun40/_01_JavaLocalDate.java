package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate : sadece gün ay yıl gisini tutar

        LocalDate tarih=LocalDate.now(); // Şu anda ki tarihi ver demek
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); // gün adı
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue()); // kaçıncı ay olduğu
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek()); // gün adı
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue()); // haftanın kaçıncı günü olduğu
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // Kendisindeki hazır formatlara bakalım : Windows'un yerel ayarlarına göre değiştirilebilir
        System.out.println("ISO_DATE="+ tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT   = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM  = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG  = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL  = "+ tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // İstediğimiz formatta gösterim
        System.out.println("\n************ İstediğimiz formatta gösterim ************");
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter oz2= DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3= DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        System.out.println("tarih EEEE dd.MM.yyyy = " + tarih.format(oz3));

        DateTimeFormatter oz4= DateTimeFormatter.ofPattern("EE dd.MM.yyyy");
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(oz4));

        DateTimeFormatter oz5= DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy");
        System.out.println("tarih MMMM EEEE dd.MM.yyyy = " + tarih.format(oz5));

        DateTimeFormatter oz6= DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM dd EEEE yyyy = " + tarih.format(oz6));

        // Kısaca bu şekilde yazılabilir
        System.out.println("tarih MMMM dd EEEE yyyy = " +
                tarih.format(DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy")));




    }
}
