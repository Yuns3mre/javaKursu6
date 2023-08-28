package Gun34._03_Soru;

public class LiseOgrencisi extends Ogrenci {

    private String brans;
    private static int lisesayacID=1;
    public LiseOgrencisi(String isim,String brans) {
        super(isim, OgrTip.LISE,lisesayacID++);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"branş="+this.brans;
    }
}
