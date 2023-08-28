package Gun33._02_Inheritance;

public class Ordek extends Hayvan{

    private int kanatAcikligi;
    public Ordek(String renk, int kilo, String cinsi,int kanatAcikligi) {
        super(renk, kilo, cinsi);
        setKanatAcikligi(kanatAcikligi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vakladı");
    }

    @Override
    public String toString() {
        return super.toString()+", kanat acikligi="+this.kanatAcikligi;
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }
}
