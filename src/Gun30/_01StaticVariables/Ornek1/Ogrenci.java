package Gun30._01StaticVariables.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
   static String okulAd="Yıldırım İlkokulu";
   // kod adı: sen bitanesi
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar.
    // hepsine atanır, tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "\nad='" + ad + '\'' +
                ", \nsoyad='" + soyad + '\'' +
                ", \nokulAd='" + okulAd + '\'' +
                '}';
    }
}
