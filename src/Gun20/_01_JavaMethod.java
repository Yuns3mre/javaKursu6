package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {

        // kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra
        // diizinin en küçük ve en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız


        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[5];


        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz=");
           dizi[i] = oku.nextInt();

        }

        System.out.println(Arrays.toString(dizi));

        enBuyukYaz(dizi);
        enKucukYaz(dizi);
        ortalamaYaz(dizi);

    }
    public static void enBuyukYaz(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("En büyük = " +dizi[ dizi.length-1]);

    }

    public static void enKucukYaz(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("En küçük=" + dizi[0]);

    }

    public static void ortalamaYaz(int[] dizi){
        double toplam=0;

        for (int i = 0; i < dizi.length; i++) {
            toplam = toplam + dizi[i];
        }

        double ort=toplam/dizi.length;
        System.out.println("ort = " + ort);

    }

}
