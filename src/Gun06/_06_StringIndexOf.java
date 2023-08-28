package Gun06;

public class _06_StringIndexOf {
    public static void main(String[] args) {

        // IndexOf : verilen karakter(ler)in indexini verir
        // 01234 : Harflerin oda numarası
        // Bugün

        String cumle="Merhaba Dünya";
        // h'nin o da numarası -> 3
        // a'nın oda numarası -> 4
        // Dü'nün oda numarası kaç -> 8
        System.out.println("cumle.indexOf(M) = " + cumle.indexOf("M"));
        System.out.println("cumle.indexOf(h) = " + cumle.indexOf("h"));
        System.out.println("cumle.indexOf(ü) = " + cumle.indexOf("ü"));
        System.out.println("cumle.indexOf(Dü) = " + cumle.indexOf("Dü"));
        System.out.println("cumle.indexOf(Dün) = " + cumle.indexOf("Dün"));
        System.out.println("cumle.indexOf( ) = " + cumle.indexOf(" "));
        System.out.println("cumle.indexOf(A) = " + cumle.indexOf("A"));  // olmadığı için yok manasında -1 verir

        System.out.println("cumle.indexOf(a,5)= " +cumle.indexOf("a",5));
           // 5 nolu indexten sonra hangi a var
        System.out.println("cumle.indexOf(a,7)= " +cumle.indexOf("a",7));













    }
}
