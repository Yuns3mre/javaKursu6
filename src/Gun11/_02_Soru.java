package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

        // Otopark ücretleri:
        // 3 saate kadar 10 TL, 5 saate kadar 15 TL, 5'den büyükse 20 TL dir
        // Kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.print("Kalınan süre= ");
        int sure= read.nextInt();

        if (sure<=3 )
            System.out.println("Ücret 10 Tl");

        if (sure<=5 && sure>=3)
            System.out.println("Ücret 15 TL ");
           else
            System.out.println("Ücret 20 TL");









    }
}
