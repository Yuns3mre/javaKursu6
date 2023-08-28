package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        //kişinin kilosunu kg (double) ve boyunu m(double)ekrandan alınız
        // ekrana kilonuz: ... boyunuz: .....  yazdıkltan sonra
        // vücut kitle indeksini bulunuz. kilo/(boy*boy)


        Scanner read=new Scanner(System.in);
        System.out.print("Boyunuzu(m) giriniz=");
        double boy=read.nextDouble();

        System.out.print("kilonuzu(Kg) giriniz=");
        double Kg= read.nextDouble();

        System.out.println("Boyunuz= "+ boy+"m" );
        System.out.println("Kilonuz="+ Kg+"Kg");
        double Indeks=Kg/(boy*boy);

        System.out.println("Vücut Kitle İndeksi = " + Indeks);








    }
}
