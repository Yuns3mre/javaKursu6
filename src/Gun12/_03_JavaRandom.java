package Gun12;

import java.util.Scanner;

public class _03_JavaRandom {
    public static void main(String[] args) {

        // (int) (Math.random)*10 -> 0-0,9 arası üretir
        // 20-30 arasında Random sayı almak için max ve min sayıları bilmek gerekir

        // Girilen min ve max aralığında random sayı üreten programı yazınız

        Scanner read=new Scanner(System.in);
        System.out.print("min=");
         int min= read.nextInt();

        System.out.print("max=");
         int max= read.nextInt();

         int randSayi=(int) (Math.random()*(max-min)) + min;
        System.out.println("randSayi = " + randSayi);





    }
}
