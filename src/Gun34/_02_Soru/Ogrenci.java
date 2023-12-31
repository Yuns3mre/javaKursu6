package Gun34._02_Soru;

public class Ogrenci {
    private int id;
    private String isim;
    private OgrTip tipi;

    private static int sayacID=1;

    public Ogrenci(String isim, OgrTip tipi) {
       setIsim(isim);
        setTipi(tipi);
       setId(sayacID++);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci:" +
                "\nid=" + id +
                "\nisim='" + isim +
                "\ntipi=" + tipi ;
    }
}


