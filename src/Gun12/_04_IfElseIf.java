package Gun12;

import java.util.Scanner;

public class _04_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, Bölme için B, Çarpma için Ç
        // harfleriini yine kullanıcıdan alarak isteğe uygun olan
        // işlemleri yaptırıp yazdırınız

        Scanner oku=new Scanner(System.in);
        Scanner okuSt=new Scanner(System.in);

        System.out.print("1.sayi? = ");
        int sayi1= okuSt.nextInt();

        System.out.print("2.sayi? = ");
        int sayi2= okuSt.nextInt();

        System.out.println("Toplama için T ");
        System.out.println("Çıkarma için Ç ");
        System.out.println("Çarpma için P ");
        System.out.println("Bölme için B ");
        System.out.print("Seçiminiz=");
        String secim= okuSt.next();

        // Merdivenli If, Ladde If

        if (secim.equalsIgnoreCase("T"))
            System.out.println("Toplam=" + (sayi1+sayi2));
         else
             if ((secim.equalsIgnoreCase("Ç")))
                 System.out.println("Çıkarma=" + (sayi1-sayi2));
              else
                  if ((secim.equalsIgnoreCase("P")))
                      System.out.println("Çarpma=" + (sayi1*sayi2));
                  else
                      if (secim.equalsIgnoreCase("B"))
                          System.out.println("Bölme=" + ((double)sayi1/sayi2));
                      else
                          System.out.println("Hatalı giriş");








    }
}
