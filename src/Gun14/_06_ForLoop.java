package Gun14;

public class _06_ForLoop {
    public static void main(String[] args) {

        // 0'dan 100'e kadar olan çift sayıların toplamını yazdırın
        // toplam 50'yi geçtiğinde, mesaj yazınız (toplam 50'yi geçti)

        int toplam=0;
        boolean sinirAsildi=false;


        for (int i = 0; i <= 100; i=i+2)
        {
            toplam=toplam+i;
            System.out.println("i = " + i);

            if (toplam>50 && sinirAsildi==false)
            {
                System.out.println("Toplam 50'yi geçti ");
                sinirAsildi = true;
            }

        }













    }
}
