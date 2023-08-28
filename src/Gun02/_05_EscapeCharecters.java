package Gun02;

public class _05_EscapeCharecters {
    public static void main(String[] args) {

        // \n -> Yeni satır açar, alt satıra geçer
        // \t -> Tab tuşuna basar 2,3 harflik boşluk oluşturur
        // \b -> Backspace etkisi oluşturur, yani bir karakter geri siler
        // \" -> Tırnak yazdırmak için kullanılır
        // \\ -> Ekrana bir tane \ yazar
        // \r -> Satır başına gider

        System.out.println("MerhabaDünya");   // MerhabaDünya yazar
        System.out.println("Merhaba\nDünya"); // Merhaba yazar, alt satıra geçer Dünya yazar
        System.out.println("Merhaba\tDünya"); // Merhaba   Dünya yazar (tab tuşu kadar boşluk bırakır)
        System.out.println("Merhaba\bDünya"); // MerhabDünya yazar, bi karakter siler geriden
        System.out.println("Merhaba\"Dünya"); // Merhaba"Dünya yazar
        System.out.println("Merhaba\\Dünya"); // Merhaba\Dünya yazar
        System.out.println("Merhaba\rDünya"); // Merhaba yazar siler sonra da Dünya yazar genelde saatlerde kullanılır










    }
}
