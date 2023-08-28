package Gun08;

public class _01_StringReplace {
    public static void main(String[] args) {


        // Replace: bir String ifadesi içerisndeki karakter(ler)i verilenle değiştirir.Hepsini.

        String text="Merhaba Dünya";

        System.out.println("text = " + text);

        System.out.println("text.replace(a,e) = " + text.replace("a","e")); // Merhebe Dünye
        System.out.println("text.replace(ba,de) = " + text.replace("ba","de")); // Merhade Dünya
        System.out.println("text.replace(Merhaba,Hello) = " + text.replace("Merhaba","Hello"));
        System.out.println("text.replace(a,' ') = " + text.replace("a"," ")); // Merh b Düny












    }
}
