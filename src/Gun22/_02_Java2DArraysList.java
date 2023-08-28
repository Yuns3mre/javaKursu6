package Gun22;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_Java2DArraysList {
    public static void main(String[] args) {


int sayi=5; // tek bir rakam saklayabilen bir değişken
        int[] dizi= new int[20]; // 20 adet sayı saklayabilen bir değişken
                                // uzunluk sabit, her bir hücresinde bir sayı var

        int[][] tablo=new int[20][10]; // 20 satır, 10 sütunu var 2000 sayı saklar
                                       // uzunluk sabit, her bir hücrede bir dizi var
                                       // her bir satırda 10 sayı olan bir dizi var

        ArrayList<Integer> liste=new ArrayList<>(); // her bir satır (hücresi)
                                                    // Integer bir sayı saklayabilicek, atışdıkça
                                                    // Integer'in listi, uzunluk değişken


        ArrayList<Integer> matNotlari=new ArrayList<>(); // tek boyut
        ArrayList<Integer> fizNotlari=new ArrayList<>(); // tek boyut
        ArrayList<Integer> kimNotlari=new ArrayList<>(); // tek boyut

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);


        fizNotlari.add(50);
        fizNotlari.add(60);

        fizNotlari.add(50);
        fizNotlari.add(70);
        fizNotlari.add(80);
        fizNotlari.add(90);

        // ArrayList'lerin ArrayList'i
        ArrayList< ArrayList<Integer> > tumNotlar=new ArrayList<>();
        tumNotlar.add(matNotlari);
        tumNotlar.add(fizNotlari);
        tumNotlar.add(kimNotlari);

        tumNotlar.get(0); // mat notlarınız
        tumNotlar.get(0).get(0); // ilk mat notu

        System.out.println("tumNotlar.get(0) = " + tumNotlar.get(0)); // mat notları
        System.out.println("tumNotlar.get(1) = " + tumNotlar.get(1)); // fiz notları
        System.out.println("tumNotlar.get(2) = " + tumNotlar.get(2)); // kim notları

        // ilk mat notu
        System.out.println("tumNotlar.get(0).get(0) = " + tumNotlar.get(0).get(0));

        /*****************Satır yazdırma*******/

        for (int i = 0; i < tumNotlar.size(); i++)
        {
            System.out.println("tumNotlar = " + tumNotlar.get(i));
        }

        /****************Satır sütun yazdırma******/

        for (int i = 0; i < tumNotlar.size(); i++)
        {
            for (int j = 0; j < tumNotlar.get(i).size(); j++)
                System.out.println("tek tek notlar= " + tumNotlar.get(i).get(j));{

            }
        }
























    }
}
