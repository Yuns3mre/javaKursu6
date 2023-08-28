package Gun04;

public class _03_WdeningCasting {
    public static void main(String[] args) {
        // 1.  küçük alanı -> büyüğe atabiliyor (Genişletme-Wıdenıng)
        // byte  -> short -> ınt -> long -> float -> double (küçükten büyüğe)
        // bu şekilde olursa veri kaybı olmaz

        int sayi=9;
        long toplam=6700;
        double oran=3.2;

        oran=sayi; // tam sayı, daha geniş ondalıklı hafızaya atılıyor
        System.out.println("oran = " + oran); //  veri kaybı yok 9.0

         toplam=sayi; // int -> long
        System.out.println("toplam = " + toplam); //  veri kaybı yok 9

        oran=toplam; // long -> double
        System.out.println("oran = " + oran); //  veri kaybı yok 9.0










    }
}
