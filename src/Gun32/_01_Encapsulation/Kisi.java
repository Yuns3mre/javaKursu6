package Gun32._01_Encapsulation;

public class Kisi {
    private String ad; // 25 karakter sınırı
    private String soyad; // 25 karakter sınırı
   private int yas;

    public void yasAta(int yas)
    {
        if (yas<0)
            System.out.println("Hatalı giriş");
        else
            this.yas=yas;
    }

    public  void setAd(String ad){
        if (ad.length()<25)
            this.ad=soyad;
        else
            System.out.println("Hatalı giriş");
    }

    public  void setsoyad(String soyad){
        if (soyad.length()<25)
            this.soyad=soyad;
        else
            System.out.println("Hatalı giriş");
    }

    public int yasVer(){
        return this.yas;
    }

    public String getSoyad(){
        return this.soyad;

    }

    public String getAd(){
        return this.ad;

    }
}
