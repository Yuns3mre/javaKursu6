package Gun29._03_Protected.PaketBir;

public class Doktor {
   public String hastaneAd; // public:  diğer paketlerden erişim izni verildi
    String adi; // default
   protected String bolum; // default ile aynı
   private String sicilNo; // private sadece class içinden erişileilir

     Doktor() { // Sadece kendi paketindekliler erişebilir
    }

    public Doktor(String adi) { // Diğer tüm paketlerden erişilebilir
        this.adi = adi;
    }
}
