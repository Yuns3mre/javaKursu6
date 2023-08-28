package Gun28._03_Ornek;



public class Kitapci {
    public static void main(String[] args) {

       Kitap kit1=new Kitap();

        kit1.name="Harry Potter";
        kit1.publishYear=1997;
        kit1.author="JR Rowling";



       Kitap kit2=new Kitap("Yüzükler",1954,"JRR Tolkien");
       Kitap kit3=new Kitap("Üzüm",2023);

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);





    }
}
