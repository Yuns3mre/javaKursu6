package Gun43;

import java.util.ArrayList;


public class _01_NesneObject {
    public static void main(String[] args) {

        // Her şey bir nesne(object) mi?
        // Kisi ogr1=new Student();
        // Object ogr1= new Student();

        ArrayList<Object> genelList=new ArrayList<>();
        genelList.add(1);
        genelList.add("ismet");
        genelList.add(3.5);
        genelList.add(true);

        // Her tip eklenebiliyor, çünkü bütün türler Object türetildiği için

        double oran=410/3.0;
        System.out.println("oran = " + oran);

       //  System.out.printf("Formatı",değişkenleri); yazıyorsun

        System.out.printf("%f",oran); // %f : % değişkenin geleceği yer
                                      // f : double,float kesirli her şey için geçerli

        System.out.printf("sonuç= %4.1f\n",oran);
        // 4 : Toplamda 4 hane kullanılıcak nokta dahil
        // 1 : Noktadan sonra kaç hane kullanılıcak

        System.out.printf("sonuç= %-4.1f\n",oran); // - olunca sola dayalı yapacak

        int sayi=5;
        System.out.printf("Sonuç= %-5.2f , tamSayi=%d",oran,sayi);

        // f : double veya float
        // d : decimal : tam sayı
        // s : String değişkenler















    }
}
