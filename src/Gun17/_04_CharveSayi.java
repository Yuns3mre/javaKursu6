package Gun17;

public class _04_CharveSayi {
    public static void main(String[] args) {

   // A hava abilgisayar için her şey sayı
   // A -> 65
   // a -> 97
   //
   // Karakter ve karlışık gelen sayıların yer aldığı bir tablo
   // A -> 65, 65 saklıyor
   // 65 -> A, A yazıyor
   //
   // Bu tabloya ascii tablosu denir

        int sayi=65;
        System.out.println("sayi = " + sayi);

        char harf=(char) 65;
        System.out.println("harf = " + harf);


        // ascii tablosu
        for (int i = 0; i <= 355; i++) {

            harf= (char) i;
            System.out.println(i+"nolu harf = " + harf);

        }



        // 355 toplam ascii karakter tablosu sayısı








    }
}
