package Gun15;

import java.util.Scanner;

public class _02_ForLoop {
    public static void main(String[] args) {

        // Girilen bir sayıya kadar (dahil) olan sayıların çarpımını bulunuz
        // çarpımın değeri 1000'i geçtiğinde işlem sonlansın

        Scanner okur = new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sinir = okur.nextInt();

        int carpim = 1;
        for (int i = 1; i < sinir; i++) {
            System.out.println("carpim = " + carpim + "*" + i);
            carpim = carpim * i;
            System.out.println("-> " + carpim);

            if (carpim > 1000) {
                System.out.println("Break çalıştı");
                break;
            }


        }


    }
}
