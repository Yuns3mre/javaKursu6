package Gun08;

public class _04_JavaAritmeticOperators {
    public static void main(String[] args) {
        int a=9;
        int b=5;

        System.out.println("Toplama işlemi");
        System.out.println("a+b sonucu = " +(a+b));

        System.out.println("Çıkartma işlemi");
        System.out.println("a-b sonucu = " +(a-b));

        System.out.println("Çarpma işlemi");
        System.out.println("a*b sonucu = " +(a*b));

        System.out.println("Bölme işlemi");
        System.out.println("a/b sonucu = " +(a/b));
        // iki değerde int olduğu için sonuç int olur.Sonuç-> 1
        // ondalıklı olanı göremek istiyorsak da en az birine double yazarız. Sonuç-> 1,8
        System.out.println("(double)a/b sonucu = " +((double)a/b));

        /******************************************************/

        System.out.println("Modül işlemi : bölümünden kalan demek"); // 10/3 -> bölüm 3,kalan 1
        System.out.println("a%b = " + (a%b));
        // Bölme işlemlerindeki kalanı almak için % işareti kullanılır
        // 9%5 -> 4 iken, 5%9 -> 5 çünkü bölünmez
        System.out.println("b%a = " + (b%a));















    }
}
