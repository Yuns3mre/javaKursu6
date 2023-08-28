package Gun30._02_FinalVariables.Ornek1;

public class Scholl {
    public static void main(String[] args) {

       Student ogr1=new Student(1,"İsmet Temur");
       Student ogr2=new Student(2,"Mehmet Yılmaz");
       Student ogr3=new Student(3,"Beyza Demir");

       // Hem id takip etmek zorundayım
        // hem de hata olasılığı yüksek

        Student ogr10=new Student("ismet");
        Student ogr11=new Student("Mehmet");
        Student ogr12=new Student("Ayşe");

        System.out.println("ogr10 = " + ogr10); // id=1
        System.out.println("ogr11 = " + ogr11); // id=2
        System.out.println("ogr12 = " + ogr12); // id=3

       // ogr10.id=5005; final verdiğin için değişemez
        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken , ya da Constructor da









    }
}
