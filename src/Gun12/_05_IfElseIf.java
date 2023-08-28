package Gun12;

import java.util.Scanner;

public class _05_IfElseIf {
    public static void main(String[] args) {

        //  Kullanıcıdan Fizik:90 şeklinde not bilgisini alını
        // >= 90 için A
        // >= 80 için B
        // >= 70 için c
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız


        Scanner read=new Scanner(System.in);
        System.out.print("Dersi ve notu giriniz=");
        String dersVeNot= read.nextLine();

        // 1.yöntem substring
        int ind=dersVeNot.indexOf(":");
        int ogrNot=Integer.parseInt(dersVeNot.substring(ind+1));
        System.out.println("ogrNot = " + ogrNot);

        // 2.yöntem regex : 0-9 un dışındakileri ^ sil
        ogrNot= Integer.parseInt(dersVeNot.replaceAll("[^0-9]",""));
       // System.out.println("ogrNot = " + ogrNot);

        // else if yapısı
        if (ogrNot >= 90)
            System.out.println("A");
        else if (ogrNot >= 80)
            System.out.println("B");
        else if (ogrNot >= 70)
            System.out.println("C");
        else if (ogrNot >= 60)
            System.out.println("D");
        else if (ogrNot >= 40)
            System.out.println("E");
        else
            System.out.println("F");



    }
}
