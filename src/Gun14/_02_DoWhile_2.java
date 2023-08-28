package Gun14;

import java.util.Scanner;

public class _02_DoWhile_2 {
    public static void main(String[] args) {

        // Kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan ve
        // x girildiğinde ise "Program bitti" yazan bir oluşum yapınız

        Scanner read=new Scanner(System.in);
        String girilen;

      do{
          System.out.print("değer giriniz=");
          girilen=read.next();



         if (!girilen.equalsIgnoreCase("x"))
          System.out.println("Program çalışıyor");

         } while(!girilen.equalsIgnoreCase("x"));


        System.out.println("Program bitti");








    }
}
