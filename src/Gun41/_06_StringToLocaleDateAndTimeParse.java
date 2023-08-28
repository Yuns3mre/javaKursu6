package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _06_StringToLocaleDateAndTimeParse {
    public static void main(String[] args) {

        // Kullanıcıdan alınan ve string durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine çevirilmesi

        Scanner oku=new Scanner(System.in);
        System.out.print("Tairh giriniz (25.01.2023) = " );
        String strTarih= oku.nextLine();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strTarih);

        System.out.println("tarih.format(f) = " + tarih.format(f));



    }
}
