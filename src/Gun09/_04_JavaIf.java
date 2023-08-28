package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        // Girilen bir sayının tek mi,çift  mi olduğunu yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.print("sayı=");
        int sayi= read.nextInt();

        int kalan=sayi%2;


        if (kalan==1)
            System.out.println("Sayı tek");

        if (kalan==0)
            System.out.println("Sayı çift");








    }
}
