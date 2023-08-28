package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

        // Girilen bir sayının tek mi, çift mi olduğunu yazdırınız


        // Normal Yöntem
        Scanner read =new Scanner(System.in);
        System.out.print("SAYI=");
        int sayi= read.nextInt();


        if (sayi%2 == 0)
            System.out.println("Sayı çift");
        else
            System.out.println("Sayı tek");

        // KISA IF MANTIĞI
        String sonuc=(sayi%2 == 0) ? "Çift" : "Tek" ; // ? -> if,  : -> else işareti olur
        System.out.println("sonuc = " + sonuc);
        
        // 2. yol
        System.out.println((sayi%2 == 0) ? "Çift" : "Tek" );


        














    }
}
