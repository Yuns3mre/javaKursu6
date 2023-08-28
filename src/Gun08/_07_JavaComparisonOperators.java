package Gun08;

public class _07_JavaComparisonOperators {
    public static void main(String[] args) {

        // eşit mi, farklı mı, büyük mü, küçük mü, büyük eşit mi, küçük eşit mi

        int a=50;
        int b=50;

        // = atama işaretiyken, == eşit mi? olarak kullanılır.

        boolean esitMi= (a==b); // a değeri b değerine eşit mi?

        System.out.println("a ve b eşit mi? = " + esitMi); // true


        // farklı mı diye sormak için de != işareti yapılır

        System.out.println("a ve b farklı mı? = " +  (a != b) );

        System.out.println("a, b'den büyük mü? = " +  (a>b) );
        System.out.println("a, b'den küçük mü? = " +  (a<b) );

        System.out.println("ai b'den büyük eşit mi? = " +  (a>=b) );
        System.out.println("ai b'den küçük eşit mi? = " +  (a<=b) );
















    }
}
