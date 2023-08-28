package Gun04;

public class _05_Ornek1 {
    public static void main(String[] args) {
        int bolunen=10;
        int bolen=3;

        double sonuc= (double)bolunen / bolen;
        System.out.println("sonuc = " + sonuc); // görüntüsü 3 olur
        // Kural int/int olan işlemlerde sonuç her zaman int olur


        // en az bir tanesini double yaparsan denklem sağlar
        //  double sonuc= (double)bolunen / bolen; işleminde en az birine double yazmalıyız.

     //  10/3 -> 3  her zaman tam sayı kısmını veriyor sonuç olarak (3)

        int sayi1=10;
        int sayi2=3;

        int tamSonuc= sayi1/sayi2;
        System.out.println("tamSonuc = " + tamSonuc); // 3 çıkıcak
        /*************************************************************/

        int s1=10;
        int s2=3;

        double doubleSonuc= s1/(double)s2;
        System.out.println("doubleSonuc = " + doubleSonuc);













    }
}
