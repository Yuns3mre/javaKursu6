package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {

        // Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırın
        // oise sayıyı yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= read.nextInt();

        if (sayi>0) {
            System.out.println("Sayı pozitif");
        }

        if (sayi<0) {
            System.out.println("Sayı negatif");
        }

        if (sayi==0) {
            System.out.println("sayı=0");
        }











    }
}
