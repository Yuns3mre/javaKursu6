package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabayaz(); // giden ve dönen yok
        toplamyaz(4,5); // giden var, dönen yok
        int enb=Math.max(4,5); // giden var, dönen var (eşitleyebiliyorsak dönen var)
        double rndSayi=Math.random(); // giden yok, dönen var (eşitleyebiliyorsak dönen var)

        /*******************/

        enBulyaz(4,5);
        enb=enBulGeriGonder(4,5);

    }
    public static int enBulGeriGonder(int s1,int s2) // sırasıyla eşleniyor
    { // void : tipsiz demek, yani return'ü yok
        int enb=0;
        if (s1>s2)
            enb=s1; // return s1;
        else
          enb=s2; // return s2;

        return enb; // dönecek elemanın tipini metodun adından önce yazıyoruz

    }
    public static void enBulyaz(int s1,int s2) // sırasıyla eşleniyor
    {
        if (s1>s2)
            System.out.println("s1 = " + s1);
        else
            System.out.println("s2 = " + s2);
    }

    public static void  toplamyaz(int s1,int s2) // sırasıyla eşlenir
    {
        System.out.println("toplam="  + (s1+s2));
    }

    public static void merhabayaz()
    {
        System.out.println("Merhaba Dünya");
    }

}
