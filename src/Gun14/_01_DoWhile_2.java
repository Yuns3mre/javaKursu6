package Gun14;

import java.util.Scanner;

public class _01_DoWhile_2 {
    public static void main(String[] args) {

        // Kullanıcı 0 değeri girene kadar girdiği sayıların toplamını bulunuz

        Scanner read=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

       do {

            System.out.print("Sayı giriniz=");
            sayi= read.nextInt();

            toplam=toplam+sayi;



        }while (sayi !=0);


        System.out.println("toplam = " + toplam);














    }
}
