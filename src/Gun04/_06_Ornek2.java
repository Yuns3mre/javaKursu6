package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        String bagis1="500"; // kelime olarak alınır
        String bagis2="1500"; // kelime olarak alınır
        
        // bana toplam bağış miktarı lazım 
        // int toplam=bagis1+bagis2; bu olmadı çünkü bunlar inte yani rakama dönüşmesi lazım

      int rakamBagis1=Integer.parseInt(bagis1);
      int rakamBagis2=Integer.parseInt(bagis2);
      int toplam=rakamBagis1+rakamBagis2;

        System.out.println("toplam = " + toplam);



















    }
}
