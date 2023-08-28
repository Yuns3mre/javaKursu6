package Gun11;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {

        // yanyana aralarında bir boşlukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner read=new Scanner(System.in);
        System.out.print("Sayıları aralarında bir boşluk olarak giriniz=");
        String sayi12= read.nextLine();

        int boslukIndex=sayi12.indexOf(" ");
        String sayi1=sayi12.substring(0,boslukIndex);


        String sayi2=sayi12.substring(boslukIndex+1);


        int sayI1=Integer.parseInt(sayi1);
        int sayI2=Integer.parseInt(sayi2);

       if ( sayI1 == sayI2)
           System.out.println("sayı1=sayı2");
       else
           System.out.println("sayı1 = sayı2 eşit değil");

    }
}
