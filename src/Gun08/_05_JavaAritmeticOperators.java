package Gun08;

public class _05_JavaAritmeticOperators {
    public static void main(String[] args) {
        int sayi;
        int sayac=0;

        sayac=sayac+1; // Sayacın değerini 1 arttırır: 1
        sayac++ ;      // Sayacın değerini 1 arttırır: 2
        ++sayac ;      // Sayacın değerini 1 arttırır: 3

        sayac=sayac-1; // Sayacın değerini 1 azaltır: 2
        sayac-- ;      // Sayacın değerini 1 azaltır: 1
        --sayac ;      // Sayacın değerini 1 azaltır: 0

        System.out.println("sayac = " + sayac);

        /***************************************************/

        int toplam=5+sayac; // önce: sayac = 0, topam=0 ; sonra sayaç=0, toplam=5

        toplam=0;
        toplam=5+sayac++ ; // önce: sayac=0, toplam=0 ; sonra: sayac=1, toplam=5
        //  toplam= 5+sayac; sayac++ ;
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);



        /*
        sayac++ olduğunda soldan sağa doğru gelen işlemde öncelik onda olmuyor amma
        ++ sayac olduğunda öncelşk bunda oluyor ve de önce bu toplanıyor sonrada diğerleri
         */

        toplam=0; sayi=0;

        // işlemden önce : toplam=0, sayi=1
        toplam=5+ ++sayi;
       // işlemden sonra : toplam=6, sayi=1

        System.out.println("toplam = " + toplam);
        System.out.println("sayi = " + sayi);
        
        
        
        
        // Özet : ++'lar sağdaysa önce işlem sonra artış
        //        ++'lar soldaysa önce artış sonra işlem

        












    }
}
