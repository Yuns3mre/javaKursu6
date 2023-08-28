package Gun16;

public class _01_JavaDiziNedir { // array=dizi
    public static void main(String[] args) {

        int sayi=0;

        // ben 50 tane öğrenci notu girmek istesem hepsini tek tek yazmak zor olacağı için
        // bunları kısa yoldan yazabileceğim bir araç şart

        // Çözüm:
        int[] notlar= new int[50]; // 50 tane int saklayabilen bir değişken tanımldım

        notlar[0]=75;
        notlar[1]=89;
        notlar[2]=70;
        // ...
        // ...
        // ...
        notlar[49]=90; // En son eleman toplam eleman sayısının 1 eksiği yani lenght-1 olacak şekildedir.(index)
        // Eğer notlar[50]=56; dersen 50 değeri tanımlanmaz ve patlar

        System.out.println("notlar[0] = " + notlar[0]);
        System.out.println("notlar.length = " + notlar.length);













    }
}
