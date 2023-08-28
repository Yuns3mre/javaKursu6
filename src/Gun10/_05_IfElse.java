package Gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {

        // Girilen bir Stringin uzunluğu 10'dan büyükse ve String içinde "study" kelimesi geçiyorsa
        // ekrana evet yazdırın, geçmiyorsa hayır yazdırın

        Scanner read=new Scanner(System.in);
        System.out.print("Cümle=");
        String cumle= read.nextLine();

        if (cumle.length()>10 && cumle.toUpperCase().contains("STUDY"))
            System.out.println("istenilen sağlandı");
        else
            System.out.println("istenilen sağlanmadı");









    }
}
