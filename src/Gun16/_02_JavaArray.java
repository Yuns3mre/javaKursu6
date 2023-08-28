package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

   // Dizi nasıl okunur ve nasıl yazdırılır ?

        Scanner read=new Scanner(System.in);
        int[] array=new int[10]; // 10 elemanlı bir dizi tanımlandı

        for (int i = 0; i < 10; i++) {
            System.out.print(i+"Sayı giriniz=");
            array[i]=read.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("dizi["+i+"] = " + array[i]);

        }









    }
}
