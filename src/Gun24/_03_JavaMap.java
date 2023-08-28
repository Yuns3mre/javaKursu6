package Gun24;

import java.util.*;

public class _03_JavaMap {
    public static void main(String[] args) {

        Map<Integer,String> hm=new HashMap<>(); // Map'lerden HasMap demiş olursun yazma kolaylığı
        hm.put(9,"Tilki");
        hm.put(2,"Kedi");
        hm.put(30,"Köpek");
        hm.put(11,"Kuş");
        hm.put(4,"Kurt");
        System.out.println("hm = " + hm); // Hızlı çalışmak için kendinden sıralı


        Map<Integer,String> lhm=new LinkedHashMap<>(); // Map'lerden LinkedHasMap demiş olursun yazma kolaylığı
        lhm.put(9,"Tilki");
        lhm.put(2,"Kedi");
        lhm.put(30,"Köpek");
        lhm.put(11,"Kuş");
        lhm.put(4,"Kurt");
        System.out.println("lhm = " + lhm); // Ekleme sırasına göre kendinden sıralı


        Map<Integer,String> tm=new TreeMap<>(); // Map'lerden TreeMap demiş olursun yazma kolaylığı
        tm.put(9,"Tilki");
        tm.put(2,"Kedi");
        tm.put(30,"Köpek");
        tm.put(11,"Kuş");
        tm.put(4,"Kurt");
        System.out.println("tm = " + tm); // herzaman sıralı, kendinden sortlu














    }
}
