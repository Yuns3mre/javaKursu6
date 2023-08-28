package Gun15;

import java.util.Scanner;

public class _04_Continue {
    public static void main(String[] args) {

        // kullanıcıdan 5-10 aralığında bir sayı isteyiniz
        // bu sayılarda 6-10 aralığında olanlaro dahil etmeyiniz

        Scanner read = new Scanner(System.in);

        int toplam = 0;
        for (int i = 0; i <= 5; i++) {

            System.out.print("sayı giriniz=");
            int sayi = read.nextInt();

            if (sayi > 6 && sayi < 10)
                continue; // pas geç kendinden sonra gelen komutları oku demek

            toplam = toplam + sayi;


        }


        System.out.println("toplam = " + toplam);


    }
}
