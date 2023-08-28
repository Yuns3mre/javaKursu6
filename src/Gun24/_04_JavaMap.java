package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {

        // Bir kartvizit uygulamasını 2 kişi için yapınız

        Map<String,String> ugurKartVizit=new HashMap<>();
        ugurKartVizit.put("isim","Uğur Yılmaz");
        ugurKartVizit.put("e-mail","ugur@gmail.com");
        ugurKartVizit.put("adres","Çekmeköy/İstanbul");
        ugurKartVizit.put("telefon","05367741532");

        System.out.println("ugurKartVizit.get(isim) = " + ugurKartVizit.get("isim"));
        System.out.println("ugurKartVizit.get(e-mail) = " + ugurKartVizit.get("e-mail"));

        Map<String,String> zaferKartVizit =new HashMap<>();
        zaferKartVizit.put("isim","Zafer Canlı");
        zaferKartVizit.put("e-mail","zafer@gmail.com");
        zaferKartVizit.put("adres","Ümraniye/İstanbul");
        zaferKartVizit.put("telefon","05367561234");

        Map<String, Map<String,String>> kartvizitler=new HashMap<>();

        kartvizitler.put("ugur",ugurKartVizit);
        kartvizitler.put("zafer",zaferKartVizit);
        
        // Zaferi adresi
        System.out.println( kartvizitler.get("zafer").get("adres"));

        // ugurun adresi
        System.out.println(kartvizitler.get("ugur").get("e-mail"));
        
        for ( Map.Entry <String,Map<String,String> > kv : kartvizitler.entrySet())
        {
            System.out.println("kv = " + kv); //tek satırda tüm değerleri alıyor

            System.out.println("kv.getValue() = " + kv.getValue());

            System.out.println("e-mailler=) = " + kv.getValue().get("e-mail"));
        }










    }
}
