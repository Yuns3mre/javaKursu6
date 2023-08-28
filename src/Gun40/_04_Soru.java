package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {
    // Canlı dijital saat yapınız
    // 21:32:45-> 21:32:46-> 21:32:47->... 21:33:00-> .... Devam
    // Aynı yere yazıcak

    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter f=DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true)
        {
        LocalTime saat1=LocalTime.now();
        System.out.print("\r"+ saat1.format(f));
        // 1 sn bekle
         Thread.sleep(1000); // Milisanşye aldığı için 1000ms = 1sn
        }


        
    }
}
