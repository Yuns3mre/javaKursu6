package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // bir karenin kenar uzunluğunu kullanıcıdan
        // isteyip çevresini ve alanını bulunuz

        Scanner oku=new Scanner(System.in);

        System.out.print("kenar uzunluğu=");
        int kenar=oku.nextInt();


        int cevre=4*kenar;
        int alan=kenar*kenar;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
















    }
}
