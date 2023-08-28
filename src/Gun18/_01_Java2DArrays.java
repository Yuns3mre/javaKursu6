package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int  sayi=0; // 1 tane sayı
        int[] dii=new int[100]; // 100 sayı


        int[] ders1Not=new int[50]; // 50 kişilik ders 1 notları
        int[] ders2Not=new int[50]; // 50 kişilik ders 2 notları
        int[] ders3Not=new int[50]; // 50 kişilik ders 3 notları

        int[] [] tumDersnotlari= new int [3] [50]; // 3 tane 50'lik sayı tutaniliyor

        ders1Not[0]=80; // Tek boyutlu dizinin ilk elemanı

        tumDersnotlari [0][0]=80; // 2 indexle gösterilir, tablonun ilk elmanı

        System.out.println("tumDersnotlari[0][0] = " + tumDersnotlari[0][0]);

        Scanner oku=new Scanner(System.in);
        tumDersnotlari[0][0]= oku.nextInt();










    }
}
