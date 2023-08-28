package Gun13;

import java.util.Scanner;

public class _08_WhileLoop {
    public static void main(String[] args) {

    // Kullanıcının gireceği 20 sayıdan tek olanların toplamını bulunuz


        Scanner read=new Scanner(System.in);

       int sayac=1;
       int toplam=0;

       while (sayac<=20){

           System.out.print("Sayı giriniz=");
           int sayi= read.nextInt();
           int kalan=sayi%2;


           if (kalan == 1)
               toplam=toplam+sayi;

           sayac++;
       }
        System.out.println("toplam = " + toplam);





    }
}
