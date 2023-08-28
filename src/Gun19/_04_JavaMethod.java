package Gun19;

public class _04_JavaMethod {
    // metodların yazılabileceği yer

    public static void main(String[] args) { // ana metod, diğer metodlardan buranın içine çağıralacak
    int enb=Math.max(5,6); // max metodu değer almış,geriye büyük olanı vermiş
        double rndSayi=Math.random();


        System.out.println("Merhaba Dünya"); // veri alıyor, götürüp ekrana yazdırıyor
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // Kullanımı kolay, çağırılması kolay, tekrar tekrar kullanılır
        merhabaYaz(); // mainin daha kolay anlaşılabilir olur
        merhabaYaz(); // fonksiyonun çağırma şekli

    }

    // metodların yazılabiliceği yer
    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya : metoddan");
    }
}
