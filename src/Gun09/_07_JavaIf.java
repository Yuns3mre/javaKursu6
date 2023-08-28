package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {

        // Girilen bir cümlede küçük veya büyük a harfinin olup olmadığını kontrol ediniz
        // var, yok şeklinde yazdırın

        Scanner  raed=new Scanner(System.in);
        System.out.print("Cümle=");
        String cumle= raed.nextLine();



        if (cumle.toUpperCase().contains("A"))
            System.out.println("VAR");

        if (!cumle.toUpperCase().contains("A"))
            System.out.println("YOK");










    }
}
