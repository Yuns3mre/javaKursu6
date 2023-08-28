package Gun10;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {

        // Girilen pozitif ve tek ise ekrana uygun sayı girildi yazdır
        // değilse uygun sayı girilmedi yazdır


        Scanner read=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= read.nextInt();

        if (sayi>=0 && sayi%2 == 1)
            System.out.println("sayı pozitif ve tek");
        else
            System.out.println("sayı sağlanmadı");








    }
}
