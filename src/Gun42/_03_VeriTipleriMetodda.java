package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {

        // ilkel tip
        int sayi=5;
        sayiAtrir(sayi); // Sadece DEĞERİ gitti kendisi değil
        System.out.println("sayi = " + sayi);

        sayi=sayiAtrir2(sayi);
        System.out.println("sayi = " + sayi);


        // Referans Tiplerde(new)
        int[] dizi={1,2,3,4}; // giden referansı ise 0000, değilse 1234
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi));

        // Nesne Tiplerde
        String kelime="İsmet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime); // İsmet

        //    Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.

    }

    public static void kelimeSifirla(String kelime){
        kelime="";
    }

    public static void sayiAtrir(int sayi){ // ilkel tiplerde sadece değer gelir
        sayi++;
    }

    public static int sayiAtrir2(int sayi){ // ilkel tiplerde sadece değer gelir
        sayi++;
        return sayi;
    }

    public static void diziSifirla(int[] dizi){ // gelen referansı ise 0000, değilse 1234
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
        dizi[3]=0;
    }



}
