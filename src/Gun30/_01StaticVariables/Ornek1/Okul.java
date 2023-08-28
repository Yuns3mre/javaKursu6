package Gun30._01StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {

     // Ogrenci ogr1=new Ogrenci("İsmet", "Temur","Yıldırım İlkokulu");
     // Ogrenci ogr2=new Ogrenci("Serkan", "Şengün","Yıldırım İlkokulu");
     //   Ogrenci ogr3=new Ogrenci("Elif", "Özen","Yıldırım İlkokulu");

      //...
      //...

      // Ogrenci ogr499=new Ogrenci("Şenol", "Doğan","Yıldırım İlkokulu");
      //Ogrenci ogr500=new Ogrenci("Murat", "Savluk","Yıldırım İlkokulu");


        Ogrenci ogr1=new Ogrenci("İsmet","Temur");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Atatürk İlkokulu";
        System.out.println("ogr1 tekrarı= " + ogr1);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hafızada NESNE sayısı kadar tekrarlanması engellendi








    }
}
