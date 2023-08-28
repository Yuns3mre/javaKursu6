package Gun06;

public class _04_StringCharAt {
    public static void main(String[] args) {

       // CharAt-> istenilen noktadaki karakteri verir


        String cumle="Merhaba Dünya"; // uzunluğu=13 numaralandırma 0-12 aralığında (İndex biçim denir) 0. karakter M
        System.out.println("Uzunluk="+cumle.length()); // 13

        char ilkharf=cumle.charAt(0); // 0 daki karakteri ver demek
        System.out.println("ilkharf= " + ilkharf);


        // char harf sadece a kelimesini depolarken
        // String harf a kelimesi ve bitiş kısmını da alır a/n gibi
        // char bir oda, String bir katı saklar




    }
}
