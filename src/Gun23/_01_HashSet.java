package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

         int sayi=5; // hafızada sadece 1 sayı saklıyor
        int[] dizi=new int[6]; // hafızada 6 sayı saklıyor; sabit boyutlu
        ArrayList<Integer> liste=new ArrayList<>(); // Boyutu değişken, sınır yok

        // Java'cım şu ana kadar verdiğin değişkenle için teşekkür ederim
        // bir çok işimi gördü, şimdi bana öyle bir dizi tipi ver ki, içinde tekrar eden
        // DEĞERLER OLMASIN ve bazen istersem sıralı olsun, bazen istersem eklendiği
        // sırada olsun, bazen de olabildiğince hızlı çalışsın sıra önemli olmasın

        // Java mektuba cevap verdi:
        // Sevgili Yunus sen hiç canını sıkma, bu iş için tasarlanmış SET'ler adını
        // verdiğimiz özel diziler var.
        // HashSet -> Sen ekledikçe hızlı çalışmak için kendine göre bir sırada tutuyor.
        // LinkedHashSet -> sen ekledikçe, ekleme sırasına göre tutuyor
        // TreeSet -> sen ekledikçe onları her zaman sıralı tutuyor
        // Bunların ortak özelliği TEKRAR eden DEĞER yok

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi= hs1.add(5); // bunu ekledi mi diye soruyorum ama aynısını eklemeyeceğini biliyoruz
        hs1.add(2); // tekrar eklendi ama dizi kabul etmez

        System.out.println("hs1 = " + hs1);
        System.out.println("eklendiMi = " + eklendiMi);







    }
}
