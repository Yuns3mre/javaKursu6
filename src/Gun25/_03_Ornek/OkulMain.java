package Gun25._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okustr=new Scanner(System.in);
        ArrayList<Ogrenci> ogrenciler =new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Öğrenci Adı=");
            ogr.adi=okustr.nextLine();
            System.out.print("Öğrenci Soyadı=");
            ogr.soyadi=okustr.nextLine();
            System.out.print("Öğrenci Sınıfı=");
            ogr.sinifi=okuInt.nextInt();
            System.out.print("Öğrenci Adresi=");
            ogr.adres=okustr.nextLine();

            ogrenciler.add(ogr);

        }

        for ( Ogrenci o : ogrenciler){
            System.out.println("o.adi = " + o.adi);
            System.out.println("o.soyadi = " + o.soyadi);
            System.out.println("o.sinifi = " + o.sinifi);
            System.out.println("o.adres = " + o.adres);
        }






    }
}
