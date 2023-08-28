package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // kullanıcının adını ve soyadını ayrı ayrı okutarak ekrana  birlikte yazdırınız

        System.out.print("ad giriniz=");
        Scanner ad=new Scanner(System.in);
        String okunanad=ad.nextLine();

        System.out.print("Soyad giriniz=");
        Scanner soyad=new Scanner(System.in);
        String okunanSoyad=soyad.next();

        System.out.println("okunan Ad ve Soyad = " +okunanad+" "+okunanSoyad);

        System.out.println("Bitti");













    }
}
