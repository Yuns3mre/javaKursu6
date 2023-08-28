package Gun30._02_FinalVariables.Ornek2;

public class Vatandas {
   final int TcNo;
    String isim;
    String adres;

   private static int TcNoSAyac=1;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
        this.TcNo=TcNoSAyac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "TcNo=" + TcNo +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
