package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {

        // Duration : LocalTime ve LocalDateTime arasındaki farklar için kullanılır

        long startTime=System.currentTimeMillis(); // Şu andaki milisaniye cinsinden zaman

        // LocalTime
        LocalTime dersBaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(21,50,5);

        Duration gunlukDersSuresi= Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);

        System.out.println("gunlukDersSuresi.toDays() = " + gunlukDersSuresi.toDays()); // toplam hali
        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours()); // toplam hali
        System.out.println("gunlukDersSuresi.getSeconds() = " + gunlukDersSuresi.getSeconds()); // toplam hali
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes()); // toplam hali
        System.out.println("gunlukDersSuresi.toMillis() = " + gunlukDersSuresi.toMillis()); // toplam hali
        System.out.println("gunlukDersSuresi.toNanos() = " + gunlukDersSuresi.toNanos()); // toplam hali

        System.out.println("gunlukDersSuresi.getNano() = " + gunlukDersSuresi.getNano());


        System.out.println("--------- LocalDateTime -----------");

        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to= LocalDateTime.now(); // Bugün


        Duration fark=Duration.between(from,to);
        System.out.println("fark = " + fark);


        System.out.println("fark.toDays() = " + fark.toDays()); // Farkın toplam günü
        System.out.println("fark.toHours() = " + fark.toHours()); // Farkın toplam saati
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // Farkın toplam dakikası

        System.out.println("--------- Kodun Performansı -----------");

        long finishTime=System.currentTimeMillis(); // Şu andaki milisaniye cinsinden zaman

        System.out.println("Geçen süre(ms)=" +(finishTime-startTime) + "ms" );











    }}
