package Gun14;

public class _03_ForLoop {
    public static void main(String[] args) {

        // 1'den 5'e kadar olan sayıları ekrana yazdırınız

        int sayac=1;
        while (sayac<=5){
            System.out.println("sayac = " + sayac);
            sayac++;

        }

       // Döngünün kaç kere döneceği belli ise sayacın başlangıç değeri belli, artış değeri belli,
        // şartı belli ise bi güzellik yapalım döngüyü basitleştirelim

        // başı belli, sonu belli, artış döngüsü  : FOR DÖNGÜSÜ

       for (sayac=1; sayac<=5; sayac++){
           System.out.println("sayac = " + sayac);
       }

       // DÖngülerle ilgili sonuç özeti:
       // Kaç kere döneceği belli ise : FOR döngüsü
       // Kaç kere döneceği belli değilse : while veya doWhile
       // kontrol baştaysa While, sondaysa doWhile kullanacağız
       //
       //








    }
}
