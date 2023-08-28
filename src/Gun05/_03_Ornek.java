package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // kullanıcının adını soy-adını  alarak erkrana yazzdırınız

        System.out.print("ad giriniz=");
        Scanner ad=new Scanner(System.in);
        String okunanad=ad.nextLine();

        System.out.print("Soyad giriniz=");
        Scanner soyad=new Scanner(System.in);
        String okunanSoyad=soyad.next();

        System.out.println("okunan Ad ve Soyad = " +okunanad+" "+okunanSoyad);

        System.out.println("Bitti");


        System.out.print("Ad-Soyad giriniz=");
        Scanner adSoyad= new Scanner(System.in);
        String okunanAdSoyad=adSoyad.nextLine();
        System.out.println("Okunan Ad-Soyad= " + okunanAdSoyad);
        System.out.println("Bitti");

        // ikiside aynı sonucu veiyor ama kısayola özen göster











    }
}
