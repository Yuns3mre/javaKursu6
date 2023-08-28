package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {

        // Otopark ücretleri:
        // 3 saate kadar 10 TL, 5 saate kadar 15 TL, 5'den büyükse 20 TL dir
        // Kullanıcıdan kaç saat kaldığını alarak ücreti yazdırınız


        Scanner read=new Scanner(System.in);
        System.out.print("Kalınan süre= ");
        int sure= read.nextInt();


        System.out.println((sure<=3) ? "10Tl" : ( (sure<=5) ? "15TL" : "20TL"     ));











    }
}
