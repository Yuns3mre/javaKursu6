package Gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        // Girilen bir sayının tek mi, çift mi olduğunu yazdırınız

        Scanner read =new Scanner(System.in);
        System.out.print("SAYI=");
        int sayi= read.nextInt();


        if (sayi%2 == 0)
            System.out.println("Sayı çift");
        else
            System.out.println("Sayı tek");









    }
}
