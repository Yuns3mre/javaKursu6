package Gun09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {

        // Girilen bir öğrencinin notuna göre 50'den büyük eşitse geçtinizi küçükse kaldınız yzdır

        Scanner read=new Scanner(System.in);
        System.out.print("Not=");
        int not= read.nextInt();

        if (not>=50)
            System.out.println("Geçtiniz");

        if (not<50)
            System.out.println("Kaldınız");













    }
}
