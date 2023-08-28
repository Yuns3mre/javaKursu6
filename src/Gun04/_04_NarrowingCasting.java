package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
     int toplam=6;
     byte sayi=5;

     sayi=(byte)toplam; // veri kaybı olmasa bile dikkatli olunmalı
        System.out.println("sayi = " + sayi); // veri kaybı var

        double oran=3.7; // tam sayı kısmını almak istiyorum
        toplam=(int)oran; // bilerek sadece tam sayı kısmını aldım

        System.out.println("toplam = " + toplam);









    }
}
