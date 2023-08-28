package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {
        //tipi    adı    başlangıç değeri
        // int     sayi = 6;

        Scanner okuyucu= new Scanner(System.in);
     // tipi   adı       yeni bir okuyucu oluşturuldu (konsoldan)


        System.out.print("Sayı giriniz=");
        // okuyucu.nextInt();  klavyeden girilen TAM SAYI değerlerini okur
        // şeklinde bırakırsak eğer ekranda çalışmaya devam eder bu yüzden bizde görüntü kümesine sayı gir der
       // görüntü kümesinden elaman gireriz örneğin 5 sonra enter'a basarız ve değer atanır
        // buna da dışardan değer atama denir


       int okunan= okuyucu.nextInt(); //klavyeden girilen TAM SAYI değerlerini okur

        System.out.println("okunan = " + okunan);
        System.out.println("Bitti");






    }
}
