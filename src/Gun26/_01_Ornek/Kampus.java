package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1001;
        ogr1.ad="Hakan";
        ogr1.soyad="Kılıç";
        // ogr1.okulAd="Bayrak Okulu";

        ogr1.okul= new Okul();
        ogr1.okul.okulAd="Bayraktar okulu";
        ogr1.okul.okulmudurAd="Selim Özel";
        ogr1.okul.adres="Ümraniye/İst";



        System.out.println("ogr1.ad = " + ogr1.ad);
        System.out.println("ogr1. = " + ogr1.okul.okulAd);

    }
}
