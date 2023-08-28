package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {
        
        A a=new A(); // etkisi yok
        System.out.println("A.mesaj = " + A.mesaj); // A'dan ...
        
        B b=new B(); // consructor çalıştı -> static değişkeninin değeri değişti
        System.out.println("A.mesaj = " + A.mesaj); // B'den ...

        A a2=new A(); // etkisi yok
        System.out.println("A.mesaj = " + A.mesaj);  // B'den ...

        // Çıktısı ne olur?
    }
}
