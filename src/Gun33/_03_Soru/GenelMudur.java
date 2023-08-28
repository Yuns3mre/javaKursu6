package Gun33._03_Soru;

public class GenelMudur extends Calisan{
    private double tazminat;
    public GenelMudur(String isim, double maas, double maasKatSayisi,double tazminat) {
        super(isim, maas, maasKatSayisi);
       setTazminat(tazminat);
    }

    @Override
    public double maashesapla() {
        return super.maashesapla()+this.tazminat;
    }

    public String toString() {
        return "Bordro" +
                "\nisim='" + super.getIsim() +
                "\nmaas=" + super.getMaas()+
                "\nmaasKatSayisi=" + super.getMaasKatSayisi()+
                "\ntazminat=" + this.tazminat+
                "\nÖdenecek Maaş=" + maashesapla()
                ;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        // Eğer kademesi bu ise maaşının yarısını alır
        this.tazminat = tazminat;
    }
}
