package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {

        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        if (cumle1 == cumle2)
            System.out.println("cumle1 ve cumle2 eşit");
        else
            System.out.println("cumle1 ve cumle2 eşit değil");

        if (cumle1.equals(cumle2))
            System.out.println("cumle1 ve cumle2 eşit");
        else
            System.out.println("cumle1 ve cumle2 eşit değil");

        // Referans Tiplerde durum
        // Scanner'la ekrandan okuduğunuzda bu şekilde görünür
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if (cumle3 == cumle4) // == referans tiplerde REFERANSLARI aynı mı diye kontrol eder
            System.out.println("cumle3 ve cumle3 eşit");
        else
            System.out.println("cumle3 ve cumle4 eşit değil");

        // Değerleri aynı mı
        if (cumle3.equals(cumle4))  // Equals her zaman DEĞERLERİ karşılaştırır
            System.out.println("cumle3 ve cumle3 eşit");
        else
            System.out.println("cumle3 ve cumle4 eşit değil");

        // ÖZET : Nesne(String) ve referans(dizi,ArrayList,Nesneler) tiplerde
        //        HERZAMAN EQUALS kullanılır.
        //        İlkel (Sayısal, boolean) tiplerde == kullanılır

    }
}
