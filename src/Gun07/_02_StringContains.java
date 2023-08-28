package Gun07;

public class _02_StringContains {
    public static void main(String[] args) {
        // contains: bir Stringin içerisinde karakter(ler)in var olup olmadığını boolean cinsinden söyler

        String cumle="Merhaba Dünya";

        boolean varMi=cumle.contains("a");
        System.out.println("varMi a = " + varMi);

        System.out.println("varMi a = " + cumle.contains("a"));
        System.out.println("varMi ya = " + cumle.contains("ya"));
        System.out.println("varMi z = " + cumle.contains("z"));














    }
}
