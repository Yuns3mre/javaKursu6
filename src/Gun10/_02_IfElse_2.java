package Gun10;

import java.util.Scanner;

public class _02_IfElse_2 {
    public static void main(String[] args) {

    // Girilen bir sayının tek mi, çift mi olduğunu yazdırınız

    Scanner read =new Scanner(System.in);
    System.out.print("SAYI=");
    int sayi= read.nextInt();


    int kalan=sayi%2;
        System.out.println("kalan = " + kalan);

        // 4 veya -4 : çiftlerde her zaman 0 gelirken
        // 5 -> 1,-5 -> -1 kalanını verir



     //  if (sayi%2 == 0)
     //        System.out.println("Sayı çift");
     //    else
     //        System.out.println("Sayı tek");









    }
}
