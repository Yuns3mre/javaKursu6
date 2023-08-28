package Gun26._02_Ornek;

import java.util.ArrayList;

public class Sirket {
    // 1- Adım : Person isimli bir  class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
    // 3- Adım : Bu değerleri yazdırınız
    // 4- Adım : getBhirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    public static void main(String[] args) {

       Person cal1=new Person();
       cal1.name="Şenol";
       cal1.surname="Doğan";
       cal1.age=20;

        Person cal2=new Person();
        cal2.name="Rüstem";
        cal2.surname="Işık";
        cal2.age=25;


        // 1.Yöntem
        System.out.println("cal1.name = " + cal1.name);
        System.out.println("cal1.surname = " + cal1.surname);
        System.out.println("cal1.age = " + cal1.age);

        System.out.println("cal2.name = " + cal2.name);
        System.out.println("cal2.surname = " + cal2.surname);
        System.out.println("cal2.age = " + cal2.age);

        // 2. Yöntem
        BilgiYazdir(cal1);
        BilgiYazdir(cal2);


        // 3. Yol
        cal1.bilgiYazdir();
        cal2.bilgiYazdir();

       // 4. Yol
       //  ArrayList<Integer> list=new ArrayList<>();
       // System.out.println("list = "+ list);
        System.out.println("cal1 = " + cal1);
        System.out.println("cal2 = " + cal2);

       //  System.out.println("cal1 = " + cal1.toString());

        cal1.getBhirthYear();
        cal2.getBhirthYear();





    }

    public static void BilgiYazdir(Person cal) // sırayla cal1, cal2
    {
        System.out.println("cal.name = " + cal.name);
        System.out.println("cal.surname = " + cal.surname);
        System.out.println("cal.age = " + cal.age);
    }

}
