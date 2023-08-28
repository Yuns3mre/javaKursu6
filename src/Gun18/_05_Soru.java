package Gun18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        // 2x3 lük bir tabloyu random 10'a kadar sayılarla
        // doldurunuz daha sonra kullanıcıdan bir sayı alınız.
        // Bu sayı tabloda var ise yerini (satır,sütun) yazdırınız




        int[][] tablo=new int[2][3]; // 2 ye 3lük bir tablo

        // tabloyu random 100'e kadar sayılarla doldurunuz

        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)

                tablo[satir][sutun]=(int)(Math.random()*10);

        }



       // Yazdırma kısmı
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++)
                System.out.print( tablo[satir][sutun] + " " );

            System.out.println();

        }

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int arananSayi= oku.nextInt();

        //Yazdırma
        for (int satir = 0; satir < tablo.length; satir++) {

            for (int sutun = 0; sutun < tablo[satir].length; sutun++) {

                if ( tablo[satir][sutun] == arananSayi)
                    System.out.println("satir=" + satir + " " + "sutun="+ " " + sutun );

            }

        }







        }
}
