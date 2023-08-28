package Gun07;

public class _01_StringConcat {
    public static void main(String[] args) {

        // concat: bir Stringle diğerini birleştirir

       String s1="Merhaba";
       String s2="Dünya";

        System.out.println("Birleşmiş hali= "+s1 + s2);
        System.out.println("Birleşmiş hali= "+s1.concat(s2));
        System.out.println("Birleşmiş hali= "+s1.concat(" ").concat(s2));
        System.out.println("Birleşmiş hali= "+s1.concat(" "+s2));













    }
}
