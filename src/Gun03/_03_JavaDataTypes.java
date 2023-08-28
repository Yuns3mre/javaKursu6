package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {
        int sayi=2; // hafızada int kadar yer kaplar, tam sayılarda default int


        // TAM SAYILAR:
        byte byteDeger=7; // -128,127 arasındaki değerler için
        short shortDeger=645; // -32.000, 32.000
        int intDeger=25000;
        long longDeger = 34343434344343433L;


        // ONDALIKLI SAYILAR:
        double doubleDeger=  3.1414141411414; // noktadan sonra 16 haneye kadar hassasiyeti var
        float floatDeger= .14141f; // noktadan sonra sonra 5 haneye kadar hassasiyeti var ama kararsız


        // KARAKTER VE HARFLER:
        char basHarf='A'; // bir tane harf saklayabilir, Tek tırnak işareti kullanılır
        String isim="ismet"; // kelime veya cümle saklayabilir, uzunluğu değişken


        System.out.println("basHarf = " + basHarf);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("sayi = " + sayi);
        System.out.println("isim = " + isim);
        





    }
}
