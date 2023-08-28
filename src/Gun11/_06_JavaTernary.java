package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {
    public static void main(String[] args) {

        // Girilen bir sayının sıfır mı, negatif mi, pozitif mi olduğunu yazdırın

        Scanner read=new Scanner(System.in);
        System.out.print( "sayı=");
        int sayi= read.nextInt();

        System.out.println((sayi>0) ? "Pozitif" : (sayi<0) ? "Negatif" : "Sıfır" );










    }
}
