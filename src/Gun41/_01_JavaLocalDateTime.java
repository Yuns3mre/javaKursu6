package Gun41;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _01_JavaLocalDateTime {
    public static void main(String[] args) {

        // LocalDateTime hem tarih hem de saat bilgisini tutar

        LocalDateTime ld=LocalDateTime.now();
        System.out.println("ld = " + ld);

        System.out.println("ld.getYear() = " + ld.getYear());
        System.out.println("ld.getMonth() = " + ld.getMonth());
        System.out.println("ld.getMonth().getValue() = " + ld.getMonth().getValue());
        System.out.println("ld.getDayOfYear() = " + ld.getDayOfYear());
        System.out.println("ld.getDayOfMonth() = " + ld.getDayOfMonth());
        System.out.println("ld.getDayOfWeek() = " + ld.getDayOfWeek());
        System.out.println("ld.getDayOfWeek().getValue() = " + ld.getDayOfWeek().getValue());
        System.out.println("ld.getHour() = " + ld.getHour());
        System.out.println("ld.getMinute() = " + ld.getMinute());
        System.out.println("ld.getSecond() = " + ld.getSecond());
        System.out.println("ld.getNano() = " + ld.getNano());

        System.out.println("ld.format(ISO_DATE_TIME) = " +
                                                        ld.format(DateTimeFormatter.ISO_DATE_TIME));

        // Özel formatta yazdırma
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd:MM:yyyy hh:mm");
        System.out.println("ld.format(f) = " + ld.format(f));

    }
}
