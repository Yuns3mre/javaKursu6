package Gun30._03_Soru;

public class Sabitler {
    final static int birGundekiSaatSayisi=24;
    final static int birSaattekiDakikaSayisi=60;
    final static int birSaattekiSaniyeayisi=60;


    public static int hesapla(int gun, int saat, int dak){

        int toplamSaniye=
                gun
                        * Sabitler.birGundekiSaatSayisi
                        * Sabitler.birSaattekiDakikaSayisi
                        * Sabitler.birSaattekiSaniyeayisi
                        +
                        saat
                        * Sabitler.birSaattekiDakikaSayisi
                        * Sabitler.birSaattekiSaniyeayisi
                        +
                        dak
                         * Sabitler.birSaattekiSaniyeayisi;

        return toplamSaniye;
    }
}
