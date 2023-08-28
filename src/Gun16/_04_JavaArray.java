package Gun16;

public class _04_JavaArray {
    public static void main(String[] args) {

        int[] dizi=new int[5]; // 5 elemanlı bir dizi
        int[] dizi2={3,6,44,55,77}; // 5elemanlı dizi hem tanımlandı hem değer atandır


        String[] cumleler=new String[5]; // 5 tane cümle saklayabilen bir dizi
        boolean[] dizi3=new boolean[5]; // 5 tane (True/False) saklanan dizi oluşur
        double[] oranlar=new double[5]; // 5 double saklayabilen bir dizi değişkein


        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizi="+dizi[i]);
        }

        for (int i = 0; i < cumleler.length; i++) {
            System.out.println("cumleler="+cumleler[i]);
        }

        for (int i = 0; i < dizi3.length; i++) {
            System.out.println("boolean dizi="+dizi3[i]);
        }

        for (int i = 0; i < oranlar.length; i++) {
            System.out.println("oranlar="+oranlar[i]);
        }




    }
}
