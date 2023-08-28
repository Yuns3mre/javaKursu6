package Gun23;

import Tools.MyFunc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class _05_Soru {
    public static void main(String[] args) {

// 10 elemanlı bir diziyi random10'(dahil)a kadar olan sayılarla
// doldurduktan, tekrarlı değerler almayacak şekilde yeni bir diziye atınız

        Integer[] dizi=new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*11); //MyFunc.rndTamSayi(10);
        }

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        // 1. Yöntem
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < dizi.length; i++) {
            ts.add(dizi[i]);
        }
        System.out.println("ts = " + ts);


        // 2. Yöntem (Kolay olan)
     TreeSet<Integer> ts2=new TreeSet<>(Arrays.asList(dizi));
    System.out.println("ts2 = " + ts2);



















    }
}
