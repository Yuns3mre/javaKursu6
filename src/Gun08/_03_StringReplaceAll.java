package Gun08;

public class _03_StringReplaceAll {
    public static void main(String[] args) {


        // Regex ifadeler nelerdir araştırma ödevi
        // Regex: Regular expression

        // ReplaceAll: replace gibi çalışır. Farklı kriterler (regex) rilebiliyor.

        String text="Merhaba1 Dünya234";
        System.out.println("Orijinal hali= " + text);
        System.out.println("a,b,n -> _ = " + text.replaceAll("[abn]","_"));
        // a,b,n değerlerini _ yap demiş olduk

        System.out.println("A,Z -> _ = " + text.replaceAll("[A-Z]","_"));
        System.out.println(" 0-9 arasını sil= " + text.replaceAll("[0-9]"," "));
        System.out.println(" 0-9 arasını sil= " + text.replaceAll("[^0-9]",""));
        // ^ işareti seçili bölge dışındakileri sil demek

        System.out.println("Harfleri sil= " + text.replaceAll("[A-Z]","_").replaceAll("[a-z]",""));
        



















    }
}
