package Gun09;

import java.util.Scanner;

public class _00_Soru {
    public static void main(String[] args) {

        // Girilen bir sayının Tek sayı olup olmadığını yazdırınız.

        Scanner read=new Scanner(System.in);

        System.out.print("Girilen sayı=");
        int sayi= read.nextInt();

        int kalan=sayi%2;
        System.out.println("Kalan Tek mi? = " + (kalan==1) );
















    }
}
