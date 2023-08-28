package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {

      // kullanıcıya öğrenci misiniz diye sorun; Evet ise true, Hayır ise false cevabını veriniz
      // ve alınan cevabı yazdırın


        Scanner oku=new Scanner(System.in);

        System.out.print("Öğrenci misiniz? =");
       boolean cevap=oku.nextBoolean(); // True veya False gibi

        System.out.println("Cevabınız="+cevap);







    }
}
