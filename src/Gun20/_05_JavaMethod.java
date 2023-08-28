package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {

        int s1=5;
        int s2=4;
        double d1=1.2;
        double d2=2.5;

        int sonuc1= toplam(s2,s1);
        double sonuc2= toplam(s2,s1);
        // metodlara aynı ismi verebilirim yeterki,
        // parametreden aynı değeri alabilsin
    }

    public static int toplam(int s1, int s2)
    {
        return s1+s2;
    }

    public static double toplam(double s1, double s2)
    {
        return s1+s2;
    }

}
