package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Girilen 6 sayıdan sadece pozitif olanlarının toplamını bulunuz

        Scanner read=new Scanner(System.in);


        int sayac=1;
        int toplam=0;

        while (sayac<=6){
            System.out.print("sayı giriniz=");
            int sayi= read.nextInt();
            if (sayi>0)
                toplam=toplam+sayi;

            sayac++;

        }
        System.out.println("Toplam=" + toplam);









    }
}
