package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
   // girilen bir adı ekrana yazdırınız


        System.out.print("isim giriniz=");
        Scanner okuyucu =new Scanner(System.in);
       String okunanIsim=okuyucu.next();// next kelime okur

        System.out.println("okunanIsim = " + okunanIsim);
        System.out.println("Bitti");


        /*
       okuyucu.next(); -> 1 kelime okur
      okuyucu.nextLine; -> yazılan satırı okur

      okuyucu.nextInt(); -> bir Tam sayı okur (int)
      okuyucu.nextShort(); -> bir Tam sayı okur (short)
      okuyucu.nextByte(); -> bir Tam sayı okur (byte)
      okuyucu.nextLong(); -> bir Tam sayı okur (long)


      okuyucu.nextDouble(); -> bir Ondalıklı sayı okur (double)
      okuyucu.nextFloat(); -> bir Ondalıklı sayı okur (float)

      okuyucu.nextBoolen(); -> true veya false girişi için okunur
       */



    }
}
