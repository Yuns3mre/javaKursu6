package Gun07;

public class _10_StringToLowerCase {
    public static void main(String[] args) {
        // ToLowerCase: Stringi küçük harfe çevirir


    String text="Merhaba Dünya";

        System.out.println("Orijinal hali= " + text);


        System.out.println("text.toLowerCase()= " + text.toLowerCase());

       boolean basliyorMu=text.startsWith("M"); // true
       boolean basliyorMu2=text.startsWith("m"); // false
        boolean basliyorMuIgnoreCase=text.toLowerCase().startsWith("m"); // true

        System.out.println("basliyorMu = " + basliyorMu);
        System.out.println("basliyorMu2 = " + basliyorMu2);
        System.out.println("basliyorMuIgnoreCase = " + basliyorMuIgnoreCase);







    }
}
