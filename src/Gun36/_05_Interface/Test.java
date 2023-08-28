package Gun36._05_Interface;

public class Test implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("Gösterdi");
    }

    @Override
    public void yazdir(String msg) {
        System.out.println(msg+"yazıldı");
    }

    @Override
    public void yaz() {
        System.out.println("yazıldı");
    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5; // metod çalıştı
        return sayfaSayisi;
    }
}
