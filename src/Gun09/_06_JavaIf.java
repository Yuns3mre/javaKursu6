package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        // girilen bir cümlede a harfi varsa evet, yoksa hayız yazdırın

        Scanner read=new Scanner(System.in);
        System.out.print("cümle=");
        String cumle= read.nextLine();
        boolean varMi=cumle.contains("a");

        if (varMi==true) {
            System.out.println("a harfi var");
        }

        if (varMi==false) {
            System.out.println("a harfi yok");
        }

        // 2. yol
        if (varMi) {
            System.out.println("a harfi var");
        }

        if (!varMi) {
            System.out.println("a harfi yok");
        }



        // Alternatif

        if (cumle.indexOf("a")>=0);
        System.out.println("Evet");


        if (cumle.indexOf("a")<0);
        System.out.println("hayır");














    }
}
