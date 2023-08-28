package Gun05;

import java.util.Scanner;

public class _10_Odevler {
    public static void main(String[] args) {

        // 1- Bir String oluşturun. Konsola İsminizi girin.İsminizi yazdırın.

        String ad="Yunus Emre";
        System.out.println("adınız = " + ad);

        // 2- Bir int oluşturu.Konsola herhangi bir sayı giriniz. Bu sayıyı yazdırınız.

        int sayi=19;
        System.out.println("Tuttuğunuz sayı= " + sayi);

        // 3- Bir String oluşturun konsola sevdiğiniz bir meyveyi yazın ve o meyveyi yazdırınız.

        String meyve="Karpuz";
        System.out.println("Sevdiğiniz meyve= " + meyve);

        // 4- Bir int oluşturun konsola arabanızdaki kapı sayısını girin ve bu inti yazdırın.

        int saYi=4;
        System.out.println("Arabanızdaki kapı sayısı= " + saYi);

        // 5- Bir String oluşturun, konsola 10 sene önceki yaşadığınız şehri yazın ve bu String'i yazdırın.

        String sehir="İstanbul";
        System.out.println("10 sene önce yaşadığınız şehir= " + sehir);

        // 6- Bir String oluşturun, doğum gününüzü konsola giriniz ve yazdırınız.

        String dogum="17.02.2004"; String doGum="Salı";
        System.out.println("Doğum gününüz= " + dogum);
        System.out.println("Doğum gününüz= " + doGum);

        // 7- Bir Boolean oluşturun konsola "Bir banka hesabınız ver mı?" yazınız. cevap olarak True/False kullanınız.

        Boolean cevap=true;
        System.out.println("Bir banka hesabınız var mı? = " + cevap);

        // 8- Bir byte oluşturunuz, konsola Kg cinsinden ağırlık yazınız ve yazdırınız.

        byte agirlik=75;
        System.out.println("Seçtiğiniz ağırlık=" + agirlik+"Kg");

        // 9- Bir float oluşturunuz, konsola boyunuzu girin ve değeri yazdırınız.

        float boy=185;
        System.out.println("Boyunuz= " + boy + "cm");


        // 10- Kullanıcıdan alacağınız 2 sayının 4 işlemini ekrana yazdırınız.

        Scanner read=new Scanner(System.in);
        System.out.print("sayi1=");
        int sayi1=read.nextInt();
        System.out.print("sayi2=");
        int sayi2=read.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println("toplam sayı= " + toplam);


        // 11- Kullanıcıdan alacağınız 3 öğrencinin ders notunun ortalamasını ekrana yazdırınız.

        Scanner reAd=new Scanner(System.in);
        System.out.print("Not1=");
        int not1=reAd.nextInt();

        System.out.print("Not2=");
        int not2=reAd.nextInt();

        System.out.print("Not3=");
        int not3=reAd.nextInt();

        int tOplam=not1+not2+not3;

        double ort=tOplam/(double)3;

        System.out.println("Not ortalaması= " + ort+" "+"Puan");













    }
}
