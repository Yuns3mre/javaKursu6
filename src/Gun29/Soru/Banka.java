package Gun29.Soru;

public class Banka {
    public static void main(String[] args) {

        Musteri mu1=new Musteri();
        mu1.musteriNo=1;
        mu1.ad="Zeynep";
        mu1.soyad="Bağlar";


        mu1.musteriHesap.paraYatir(100);
        mu1.musteriHesap.paraYatir(200);
        mu1.musteriHesap.paraCek(50);

        System.out.println("mu1 = " + mu1.musteriHesap);

       //  mu1.musteriHesap.bakiye=1000000; privat olduğu için olmaz






    }
}
