package Gun08;

import java.util.Scanner;

public class _09_Odevler {
    public static void main(String[] args) {
      // 1- **I Love Java** olan bir String oluşturun ve toplam karakter sayısını yazdırın

        String c1="I love Java";
        System.out.println("I Love Java= " + c1.length()+" "+"Karakter");

        // 2- **Sprint planning** olan bir String oluşturun ve toplam karakter sayısını yazdırın

        String c2="Sprint planning";
        System.out.println("Sprint planning= " + c2.length()+" "+"Karakter");

        // 3- **apple** olan bir String oluşturun ve içinde **app** olup olmadını doğrulayın.

        String c3="apple";
        System.out.println("apple kelimesinde app var mı? = " + c3.indexOf("app"));

        // 4- **orange** kelimesi  olan bir String oluştur ve **apple** ile eşit mi doğrula

        String c4="orange";

        System.out.println("apple ve orange eşit mi?  = " + c4.equals(c3));

        // 5- **apple** olan bir String oluşturun ve **apple** değerine eşit olup olmadığını doğrulayın

        System.out.println("apple ile apple eşit mi? = " + c3.equalsIgnoreCase(c3));

        // 6- **Florida** kelimesininden bir String oluşturun florida kelimesinin içindeki
        // sadece *o* harfinin bulunduğu indexi yazınız.

        String c5="Florida";
        System.out.println("o harfinin indexi? = " + c5.indexOf("o"));

        // 7- **Thank you** olan bir String oluşturun. Thank you içindeki *y* harfinin konumunu yazdırın

        String c6="Thank you";
        System.out.println("y harfinin konumu = " + c6.indexOf("y"));


        // 8- **Mouse** adında Stringer oluşturun ve 3. sıradaki karakteri yazdırın

        String c7="Mouse";
        System.out.println("3. noktadaki karakter = " + c7.charAt(3));

        // 9- **paper** olan bir String oluşturun ve bu Stringi büyük harfe çevirin.

        String c8="paper";
        System.out.println("paper kelimesinin büyük harfle yazımı = " + c8.toUpperCase());

        // 10- **OraNge** olan bir String oluşturun ve küçük harfe çevirin

        String c9="OraNge";
        System.out.println("OraNge kelimesinin küçük harfle yazımı= " + c9.toLowerCase());

        // 11- **New Jersey** olan bir String yazdırın ve Stringi büyük harfe çevirip yazdırın.

        String c10="New Jersey";
        System.out.println("New Jersey'in büyük harfle yazımı= " + c10.toUpperCase());

        // 12-  **New York** olan bir String yazdırın ve Stringi küçük harfe çevirip yazdırın.

        String c11="New York";
        System.out.println("New York'un küçük harfle yazımı= " + c11.toLowerCase());

        // 13- **Paddle** olan bir Stringi küçük harfe çeviriniz 
        
        String c12="Paddle";
        System.out.println("Paddle kelimesinin küçük harf hali = " + c12.toLowerCase());

        // 14- ayrı ayrı girilen ad ve soyadı aralarını bir boşluk koyarak birleştiriniz

        Scanner read=new Scanner(System.in);

        System.out.print("Ad=");
        String ad= read.nextLine();

        System.out.print("Soyad=");
        String soyad= read.nextLine();

        System.out.println("ad ve soyad = " + ad + " "+ soyad);

        // 15- Girilen bir kelimede boşluk olup olmadığını kontrol ediniz.

        System.out.print("Kelime=");
        String kelime= read.nextLine();

        System.out.println("Kelime boşluk içeriyor mu? = " + kelime.contains(" "));

        // 16- Girilen bir kelimenin ilk ve son harfini bulunuz

        System.out.print("Kelime=");
        String text= read.nextLine();

        char ilkHarf=text.charAt(0);
        System.out.println("ilkHarf = " + ilkHarf);


        int uzunluk=text.length();

        char sonHarf=text.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);



        // 17- Tek seferde girilen ad+ad ve soyadı baş harfleri (.) ile veriniz. Örn: Y.E.A



        System.out.print("ad ve soyad=");
        String adSoyAd= read.nextLine();

        char isim1=adSoyAd.charAt(0);
        System.out.println("ilk harf=" + isim1);

        int bosluk1=adSoyAd.indexOf(" ");
        System.out.println("bosluk1 = " + bosluk1);
        char isim2=adSoyAd.charAt(bosluk1+1);
        System.out.println("isim2 = " + isim2);

        int bosluk2=adSoyAd.lastIndexOf(" ");
        System.out.println("bosluk2 = " + bosluk2);
        char isim3=adSoyAd.charAt(bosluk2+1);
        System.out.println("isim3 = " + isim3);

        System.out.println("adSoyAd="+isim1+"."+isim2+"."+isim3+".");

        // 18- Tek seferde girilen 3 ayrı ismi ayrı ayrı yazdırınız



        System.out.print("ad-soyad=");
        String adSoyAD= read.nextLine();

        String ad1=adSoyAD.substring(0,bosluk1);
        System.out.println("ad1 = " + ad1);

        String ad2=adSoyAD.substring(bosluk1+1,bosluk2);
        System.out.println("ad2 = " + ad2);

        int uzunluK=adSoyAD.length();

        String ad3=adSoyAD.substring(bosluk2+1,uzunluK);
        System.out.println("ad3 = " + ad3);















    }
}
