package Gun07;

public class _03_StringEquals {
    public static void main(String[] args) {
        // equals: 2 Stringin birbirine eşit olup olmadığını kontrol eder. sonuç -> booolean

        String s1="Merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi = " + esitMi);
        System.out.println("esitMi = " + s1.equals(s2));
        System.out.println("esitMi = " + s1.equals("Merhaba"));
        










    }
}
