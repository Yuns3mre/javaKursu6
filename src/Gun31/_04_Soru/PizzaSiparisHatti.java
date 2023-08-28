package Gun31._04_Soru;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            menu(); // menüyü göster
            secim= oku.nextInt();
                    // seçim oku
                    // seçime göre pizzayı Arraylist'e ekle

            switch (secim){
                case 1:
                    Pizza p=new Pizza(PizzaSize.SMALL);
                    siparisler.add(p);
                    break;
                case 2:
                     p=new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(p);
                    break;
                case 3:
                     p=new Pizza(PizzaSize.LARGE);
                    siparisler.add(p);
                    break;
                case 4: siparisYazdir(siparisler);
                    break;


            }

        }while (secim<5);
    }


    public static void siparisYazdir( ArrayList<Pizza> siparisler){
        int s=0,m=0,l=0;

        for (Pizza p : siparisler)
        {
            switch (p.size){
                case SMALL: s++; break;
                case MEDIUM: s++; break;
                case LARGE: s++; break;
            }
        }

        System.out.println(s+"tane Small pizza");
        System.out.println(m+"tane Medium pizza");
        System.out.println(l+"tane Large pizza");

    }


    public static void menu(){
        System.out.println("****** Pizza Menü ******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme al-Sİparişi göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seçiminiz=");
    }
}
