package Gun33._02_Inheritance;


public class HayvanatBahcesi {
    public static void main(String[] args) {

        Kedi kedi1=new Kedi("siyah",3,"Tekir");
        System.out.println("kedi1 = " + kedi1);
        kedi1.konustu();

        Kopek kopek1 =new Kopek("beyaz",50,"Kangal");
        System.out.println("kopek1 = " + kopek1);
        kopek1.konustu();

        Yilan yilan1=new Yilan("siyah",3,"engerek",3);
        System.out.println("yilan1 = " + yilan1);
        yilan1.konustu();

        Ordek ordek1=new Ordek("beyaz",3,"anas",2);
        System.out.println("ordek1 = " + ordek1);
        ordek1.konustu();



    }
}
