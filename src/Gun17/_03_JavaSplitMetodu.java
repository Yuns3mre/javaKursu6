package Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {  public static void main(String[] args) {

  /*
   VERİLEN CÜMLEYİ BÖLMEK İÇİN KULLANILIR

   Cümle= "İkilmler çok değişti"

   String[] kelimeler= cumle.split(" ");

   kelimeler[0] -> "İklimler"
   kelimeler[1] -> "çok"
   kelimeler[2] -> "değişti"

   kelime.lenght -> 3
  */

    // Kullanıcınının gireceği bir cümlede
    // kaç kelime olduğunu bulunuz
    // for döngüsü ile yapalım
    // Bu gün hava çok güzel -> 5


    Scanner oku= new Scanner(System.in);
    System.out.print("Cümle=");
    String cumle= oku.nextLine();


    String[] kelimler=cumle.split(" "); // String metodlar

    System.out.println("Kelimler= " + cumle.split(" ").length);


    for (int i = 0; i < kelimler.length; i++) {
        System.out.println("kelimler = " + kelimler[i]);

    }


}
}
