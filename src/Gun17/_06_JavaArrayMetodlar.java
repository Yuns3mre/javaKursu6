package Gun17;

import java.util.Arrays;

public class _06_JavaArrayMetodlar {
    public static void main(String[] args) {

      String[] isimler={"Ahmet","Zeynep","Roman","Kaya","Cihan"};

      // diziyi direk ekrana yazdırmak için
        System.out.println("isimler = " + Arrays.toString(isimler));

        int[] a={1,2,3,4};
        System.out.println("a = " + Arrays.toString(a));

        // dizileri sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));


        // Diziler eşit mi
        int[] b={1,2,3,4};
        int[] c={1,2,4,9};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // T
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // F

        // contains gibi çalışır, varsa pozitif yoksa negatif sayı verir
        // sadece sıralı dizilerde çalışır
        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a,3));
        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c,3));


        // Diziyi hızlıca bir değerle doldurmak için
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));




    }
}
