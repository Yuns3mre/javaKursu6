package Gun10;

import java.util.Scanner;

public class _03_MantiksalIfadeler {
    public static void main(String[] args) {

        // Mantiksal Ifadeler : Logic Statement
        // && işarei -> and (ve)
        // || -> or (veya)

        Scanner read=new Scanner(System.in);

        System.out.println("Sayi=");
        int sayi= read.nextInt();

        int kalan=sayi%2;

        if (kalan  == 1 || kalan == -1 )
            System.out.println("TEk");
        else
            System.out.println("ÇİFT");









    }
}
