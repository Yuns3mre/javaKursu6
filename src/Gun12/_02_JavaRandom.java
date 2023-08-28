package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar olan sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        // kullanıcı bilirse tebrikler yazdırınız


        Scanner read=new Scanner(System.in);
        System.out.print("SAYI=");
        int sayi= read.nextInt();


        int tutulanSayi=(int) (Math.random()*sayi);
       // System.out.println("tutulanSayi = " + tutulanSayi); yazdırırsan cevabı önden görürsün

        // Hangi rakamı girersek o rakama kadar üreticek

        System.out.print("Tahmininiz=");

         int tahmin= read.nextInt();

         if (tutulanSayi == tahmin)
             System.out.println("Tebrikler doğru bildiniz");
         else
             System.out.println("Bilemedinkkiiiii" +" "+tutulanSayi);










    }
}
