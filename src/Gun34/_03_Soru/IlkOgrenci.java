package Gun34._03_Soru;

public class IlkOgrenci extends Ogrenci {
    private String klup;
    private static int ilksayacID=1;
    public IlkOgrenci(String isim, String klup) {
        super(isim, OgrTip.ILK,ilksayacID++);
        setKlup(klup);

    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Klup="+this.klup;
    }
}
