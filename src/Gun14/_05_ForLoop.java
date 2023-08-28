package Gun14;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {

        // kullanıcının gireceği bir rakama (dahil) kadar
        // olan sayıların toplamını bulunuz

        Scanner read=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sinir= read.nextInt();

        int toplam=0;

        for (int i = 1; i <=sinir ; i++)
        {
             toplam=toplam+i;

        }

        System.out.println("toplam = " + toplam);










    }
}
