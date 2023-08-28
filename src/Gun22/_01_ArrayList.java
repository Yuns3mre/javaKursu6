package Gun22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // Array -> Arrays metodalrı
        // ArrayList -> Collection metodları


        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);

        // sıralama işlemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);


        // Tersine çevir

        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);

        // Bütüm elemanları tek bir değerler set etme
        Collections.fill(sayilar,0);
        System.out.println("sayilar = " + sayilar);

        // replace
        Collections.replaceAll(sayilar,0,5);
        System.out.println("sayilar = " + sayilar);

        // tanımlarken değer atama
        int[]  dizi={2,3,45,56};
        ArrayList<Integer> liste=new ArrayList<>(Arrays.asList(3, 4, 78, 89));
        ArrayList<String> strList=new ArrayList<>( Arrays.asList("ahmet","ayşe","kaya"));

        System.out.println("liste = " + liste);
        System.out.println("strList = " + strList);


       // AddAll : bir listi diğerine ekliyor
        Collections.addAll(sayilar,56,77,88,99,77);
        System.out.println("sayilar = " + sayilar);

        // bir diziyi nasıl ArrayListe atarım
        Integer[] dizi2= {2,3,45,56};
        ArrayList<Integer> liste3=new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("liste3 = " + liste3);



    }
}
