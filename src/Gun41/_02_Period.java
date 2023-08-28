package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {

        // period : iki tarih arasındaki farkı tutar
        // LocalDate'ler için kullanılır

        LocalDate dogumTarihi=LocalDate.of(2004,2,17);
        LocalDate buGun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+"Yaşındasınız.");

        /*******************************************************************************/

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra=buGun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucGunSonra2=buGun.plusDays(3);
        System.out.println("ucGunSonra2 = " + ucGunSonra2);

        LocalDate ucAySonra1=buGun.plus(period3Ay);
        System.out.println("ucAySonra1 = " + ucAySonra1);

        LocalDate ucAySonra2=buGun.plusMonths(3);
        System.out.println("ucAySonra2 = " + ucAySonra2);

        /*******************************************************************************/

        // Kursun bitiş tarihini bulunuz.

        LocalDate baslangic=LocalDate.of(2023,5,15);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=baslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        // Kursun bitmesine ne kadar süre kaldı ?
        Period kursKalan=Period.between(kursBitis,buGun);
        System.out.println("kursKalan = " + kursKalan);

        // Kurs ne kadar süredir devam ediyor ?
        Period kursGecenSure=Period.between(buGun,baslangic);
        System.out.println("kursGecenSure = " + kursGecenSure);






    }
}
