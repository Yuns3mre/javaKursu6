package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // bir karenin dikdörtgeninkenar uzunluklarını
        // kullanıcıdan isteyip çevresini ve alanını bulunuz


        Scanner read=new Scanner(System.in);
        System.out.print("kısaKenar=");
        int kisaKenar=read.nextInt();
        System.out.print("uzunKenar=");
        int uzunKenar=read.nextInt();

        int cevre=2*(kisaKenar+uzunKenar);
        int alan=kisaKenar*uzunKenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);















    }
}
