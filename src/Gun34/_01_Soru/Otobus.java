package Gun34._01_Soru;

public class Otobus extends Arac{
    private int yolcuKapaitesi;
    public Otobus(String renk, int motorHacmi, String marka, int yolcuKapaitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapaitesi(yolcuKapaitesi);
    }

    public int getYolcuKapaitesi() {
        return yolcuKapaitesi;
    }

    public void setYolcuKapaitesi(int yolcuKapaitesi) {
        this.yolcuKapaitesi = yolcuKapaitesi;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Kapasite="+this.yolcuKapaitesi;
    }
}
