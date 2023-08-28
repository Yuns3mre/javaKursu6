package Gun14;

import java.util.Scanner;

public class _02_DoWhile {
    public static void main(String[] args) {

        // Kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan ve
        // x girildiğinde ise "Program bitti" yazan bir oluşum yapınız

        Scanner read=new Scanner(System.in);
        System.out.print("Harf=");
        String girilen = read.next();

        while (!girilen.equalsIgnoreCase("x")){


             System.out.print("değer giriniz=");

             girilen=read.next();

            System.out.println("Program çalışıyor");


        }

        System.out.println("Program bitti");












    }
}
