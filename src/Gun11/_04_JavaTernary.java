package Gun11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {

        // Girilen sayı 50'den büyükse 1, değilse 0 değerini yazdırın
        // TERNARY ile yapın


        Scanner read=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= read.nextInt();

        System.out.println((sayi>50) ? "1" : "0"  );









    }
}
