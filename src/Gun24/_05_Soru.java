package Gun24;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {

        //    Canlı sözcük yapılmak isteniyor
        //    Kullanıcıya aşağıdaki gibi bir menü çıkartınız
        // 1- Ekleme (Bu seçenekte kelimenin kendisini alınız ve manasını alınız)
        // 2- Düzeltme (Bu seçenekte kullanıcının kelimenin manasını düzelttiriniz)
        // 3- Listeleme
        // 4- Arama (Bu seçenekte verilen kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        int secim=0;
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        Map<String,String> sozluk= new TreeMap<>();
          // Kelime,Manası

         do {
             System.out.print("MENÜ\n1-EKLEME\n2-DÜZELTME\n3-LİSTELEME\n4-ARAMA\n5-SİLME\n6-ÇIKIŞ\nSEÇİMİNİZ=");
             secim = okuInt.nextInt();

             switch (secim){
                 case 1:
                     System.out.print("Kelime girini=");
                     String kelime= okuStr.nextLine();
                     System.out.print("Anlamı= ");
                     String anlami= okuStr.nextLine();
                     sozluk.put(kelime,anlami);
                     break;
                 case 2:
                     System.out.print("Düzeltilecek kelimeyi giriniz=");
                     kelime= okuStr.nextLine();
                     System.out.print("Anlamı= ");
                      anlami= okuStr.nextLine();
                     sozluk.put(kelime,anlami);

                     break;
                 case 3:
                     System.out.println("*** Sözlükteki kelimeler ***");
                     for ( Map.Entry<String,String> k: sozluk.entrySet() )
                         System.out.println(k.getKey()+"-"+k.getValue());
                     break;
                 case 4:
                     System.out.print("Aranan kelimeyi giriniz=");
                     kelime= okuStr.nextLine();
                     System.out.println(sozluk.get(kelime));
                     break;
                 case 5:
                     System.out.print("Silinecek kelimeyi giriniz=");
                     kelime= okuStr.nextLine();
                     System.out.println(sozluk.remove(kelime));
                     break;
                 case 6:
                     System.out.println("Çıkış");
                     break;
                 default:
                     System.out.println("Hatalı giriş.");
             }

         }while (secim < 6); //













    }
}
