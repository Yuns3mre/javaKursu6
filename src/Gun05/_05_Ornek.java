package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız


        System.out.print("sayı1=");
        Scanner oku= new Scanner(System.in);
        int sayi1= oku.nextInt();

        System.out.print("sayı2=");
        int sayi2= oku.nextInt();

       int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);


















    }
}
