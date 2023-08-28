package Gun07;

public class _06_StringSubstring {
    public static void main(String[] args) {

        // Stringin belli bir bölümünü alma işlemini yapar
        //                   11111111
        //         012345678901234567
        String s1="Merhaba arkadaslar";

        String parca1=s1.substring(3,9); // demek [3,9) aralığı şeklindedir
        System.out.println("parca1 = " + parca1);

        String parca2=s1.substring(8,15); // demek [8.15) aralığı şeklindedir
        System.out.println("parca2 = " + parca2);

        String parca3=s1.substring(8); // 8'den sonuna kadar al demek
        System.out.println("parca3 = " + parca3);













    }
}
