package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

   // Array : boyut sayısı  belli, sonradan değiştirilemez
        int[] dizi=new int[5]; // 5 elemanlı array boyutu değişmez

        // Boyutu dinamik olan, eleman ekledikle uzayan, sildikçe kısalan
        // değer = ArrayList: boyutunu baitan vermen gerekmiyor, boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList=new ArrayList<>();


        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmet"); // uzunluk 1
        isimler.add("Metin"); // uzunluk 2
        isimler.add("Burak"); // uzunluk 3
        isimler.add("Cansu"); // uzunluk 4

        System.out.println("isimler = " + isimler); // yazdırır
        System.out.println("isimler = " + isimler.size()); // uzunluğunu verir

        isimler.add(1,"Nurhayat"); // verilen index'e ekliyor, diğerleri 1 kayıyor sona doğru
        System.out.println("isimler = " + isimler);

        isimler.set(1,"Elife"); // verilen indexxi elemanı değiştirir
        System.out.println("isimler = " + isimler);

        boolean varMi=isimler.contains("Elife"); // Elife var mı
        System.out.println("Elife varMi = " + varMi);

        isimler.remove("Ahmet"); // değere göre sil
        System.out.println("isimler = " + isimler);

        isimler.remove(2); // (Burak)'ın indexe göre siler
        System.out.println("isimler = " + isimler);

        int indexOfMetin= isimler.indexOf("Metin"); // Metin'in indexi
        System.out.println("indexOfMetin = " + indexOfMetin);

        String ilkEleman=isimler.get(0);// 0. elemanı verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();
        System.out.println("isimler = " + isimler);



    }
}
