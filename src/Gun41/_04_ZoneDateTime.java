package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt=ZonedDateTime.now();
        // Şu anda benim bulundurğum zamanınn default değerini verir
        // LocalDateTime.now(); ile aynı olmuş oldu
        // diğer Zonelar için ZonedDateTime.now(ZoneID); yaparak erişiriz

        System.out.println("zdt = " + zdt);
       // zdt = 2023-08-06T11:26:16.299+03:00[Europe/Istanbul]
       // Europe/Istanbul : ZoneID


       // Locale.getAvailableLocales(); gibi
        Set<String> zamanZoneIDleri= ZoneId.getAvailableZoneIds();

        for (String z:zamanZoneIDleri ){

            if (!z.toLowerCase().contains("bul"))
                continue;
            System.out.println("z = " + z);
        }

        ZoneId zoneIDIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul=ZonedDateTime.now(zoneIDIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);
        // zdt = 2023-08-06T11:34:19.299+03:00[Europe/Istanbul]

        ZoneId zoneIDLondon=ZoneId.of("Europe/London");
        ZonedDateTime zoneLondon=ZonedDateTime.now(zoneIDLondon);
        System.out.println("zoneLondon = " + zoneLondon);
        // zoneLondon = 2023-08-06T09:34:19.478+01:00[Europe/London]




    }
}




