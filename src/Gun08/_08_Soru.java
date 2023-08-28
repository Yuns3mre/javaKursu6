package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği iki sayının birbirine eşit olup olmadığını yazdırın

        Scanner read=new Scanner(System.in);
        System.out.print("Sayı1 =");
        int s1= read.nextInt();
        System.out.print("Sayı2 =");
        int s2= read.nextInt();

        System.out.println("sayılar eşit mi?  = " +(s1==s2) );








    }
}
