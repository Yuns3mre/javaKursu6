package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {

         // kullanıcıdan alacağınnız sayılarla dolduracağınız 6 elamanlı(sayı) bir dizinin
        // sadece tek sayı olan elemanları ayrı diziye(liste)(ArrayList) atauarak
        // yazdırınız

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[6];


        for (int i = 0; i < dizi.length; i++)
        {
            System.out.print("Sayı giriniz=");
           dizi[i]= oku.nextInt();
        }

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        ArrayList<Integer> tekler=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++)
        {
         if (dizi[i] % 2 !=0) // tek demek hem negatif hem pozitif 1 hem de -1
             tekler.add(dizi[i]);
        }

        System.out.println("tekler = " + tekler);

        /*************************************/

        tekler.clear();
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.print("Sayı giriniz=");
            dizi[i]= oku.nextInt();

            if (dizi[i] % 2 !=0)
                tekler.add(dizi[i]);
        }

        System.out.println("tekler = " + tekler);




    }
}
