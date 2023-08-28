package Gun39._03_Soru;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarhi;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public static int sayacID=1;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
       setIsim(isim);
        setVahsi(vahsi);
        setDogumTarhi(dogumTarihi);
        this.id=sayacID++;
    }

    @Override
    public String toString() {

        System.out.print("yiyeceği= "); yiyecegi();
        System.out.print("yemek miktarı= "); yemekMiktari();
        System.out.print("Günlük uyku süresi= "); gunlukUykuSuresi();
        System.out.print("sesi= "); sesi();

        return "\nID=" + id +
                "\nVsim=" + isim +
                "\nVahsi mi? =" + vahsi +
                "\nDoğum Tarhi=" + dogumTarhi+
                "\n";
    }

    public int getId() {
        return id;
    }




    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarhi() {
        return dogumTarhi;
    }

    public void setDogumTarhi(String dogumTarhi) {
        this.dogumTarhi = dogumTarhi;
    }
}
