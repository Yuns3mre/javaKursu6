package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        // Girilen bir öğrencinin notuna göre 50'den büyük eşitse geçtiniz
        // küçük eşitse kaldınız yazdır

        Scanner read=new Scanner(System.in);
        System.out.print( "Not=");
        int not= read.nextInt();

        // 1. yöntem bilgisayar boş yere yoruluyor
        if (not>=50)
            System.out.println("Geçtiniz");

        if (not<50)
            System.out.println("Kaldınız");

        // 2. YÖNTEM PRATİK YOL

        if (not>=50)
            System.out.println("Geçtiniz");
        else // (not<50) ise demek
             System.out.println("Kaldınız");







    }
}
