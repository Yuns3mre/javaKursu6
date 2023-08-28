package Gun08;

public class _02_StringReplaceFirst {
    public static void main(String[] args) {

        String text="Merhaba Dünya";

        System.out.println("text = " + text);

        System.out.println("text.replaceAll(a,e) = " + text.replaceAll("a","e"));
        System.out.println("text.replaceAll(ba,de) = " + text.replaceAll("ba","de"));
        System.out.println("text.replaceAll(Dünya -> Java) = " + text.replaceAll("Dünya","Java"));
        System.out.println("text.replaceAll(a,'') = " + text.replaceAll("a",""));
                                                       // silme işlemi için "" boşluksuz olmalı











    }
}
