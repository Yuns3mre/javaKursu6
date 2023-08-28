package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // Girilen 2 sayıdan büyük olanın değerini ekrana yazdırınız  ve eşitse de yazdırınız

        Scanner read=new Scanner(System.in);

        System.out.print("Sayı1=");
        int sayi1= read.nextInt();

        System.out.print("Sayı2=");
        int sayi2= read.nextInt();

        if (sayi1>sayi2) {
            System.out.println("sayi1 daha büyük");
        }

         if (sayi2>sayi1) {
             System.out.println("sayi2 daha büyük ");
         }
         if (sayi1==sayi2) {
             System.out.println("2 sayıda eşit");
         }






    }
}
