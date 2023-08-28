package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {

        // Girilen 5 tam sayının toplamını yazdırınız
       Scanner read=new Scanner(System.in);


      int sayac=1;
      int toplam=0;


      while (sayac<=5) {

          System.out.print("sayi giriniz=");
          int sayi= read.nextInt();
          toplam=toplam+sayi;

          sayac++;
      }

        System.out.println("toplam = " + toplam);




    }
}
