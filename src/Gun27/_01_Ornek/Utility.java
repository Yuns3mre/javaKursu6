package Gun27._01_Ornek;

public class Utility { // sınıfın adı


  public String getString (int sayi) {
      return String.valueOf(sayi);
      // String'e çevirir
  }

  // Eğer bir metod nesnenin özelliklerini
    // kullanıyorsa nesne oluşturmadan
    // kullanılamaz. Dolayısıyla STATİC olamaz
    // nesne şart

    public static String getString2 (int sayi) {
        return String.valueOf(sayi);
        // String'e çevirir
    }
      // Bağımsız metodlar yani STATİC metodlar
    // herhangi bir nesneye bağlı
    // çalışması gerekmeyen metodlardır








}
