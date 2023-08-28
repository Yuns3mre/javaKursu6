package Gun08;

public class _06_JavaAssignmentOperators {
    public static void main(String[] args) {

        int a=10; // a'ya 10 değeri atandı

        a=5; // a'ya 5 değeri atanmış olur

        a=a+6; // a'ya 6 değerini ekle. Sonuç=11 oldu

        a+=6; // a'ya 6 değerini ekle 17 oldu
        // yani a'nın artış değeri 6 olmuş oldu

        a++; // a'yı 1 artır demek
        ++a; // a'yı 1 artır demek

        a+=1; // a'yı 1 artır

        /***********************************************/

        a=a-1;   // a'yı 1 azalt demek
        a--;     // a'yı 1 azalt demek
        --a;     // a'yı 1 azalt demek

        a-=1;    // a'yı 1 azalt demek
        a-=25;   // a'yı 25 azalt demek

        /***********************************************/


        int b=10;
        //  b=b/5; // b'yi 5'e böl.
        b/=5; // b'nin bölüm değeri 5 demek (aynı şey)
        System.out.println("b = " + b);

        /***********************************************/

        int c=10;
        c=c*5; // c'yi 5 ile çarp demek
       // c*=5; // c'yi 5 ile çarp demek
        System.out.println("c = " + c);

        double d=10;
        d=d*5; // d'yi 5 ile çarp demek
        // d*=5; // d'yi 5 ile çarp demek
        System.out.println("d = " + d);














    }
}
