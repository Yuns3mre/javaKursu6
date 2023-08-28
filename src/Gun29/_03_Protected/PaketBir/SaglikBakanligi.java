package Gun29._03_Protected.PaketBir;

public class SaglikBakanligi {
    public static void main(String[] args) {

       Doktor do1=new Doktor();
       do1.hastaneAd="Numune Hastanesi";
       do1.adi="İsmet";
       do1.bolum="Dahiliye";
       // do1.sicilNo private olduğu için erişilmez

        Doktor do2=new Doktor("Mehmet");

    }
}
