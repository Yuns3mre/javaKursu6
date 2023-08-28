package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("Karabaş");
       // kopek1.ses(); // havladı
       // kopek1.kokladi(); // kokladı

        Kedi kedi1=new Kedi("Tekir");
       // kedi1.ses(); // miyavladı
       // kedi1.tirmaladi(); // tırmaladı

       // KopekSesi(kopek1); // havladı
       // KediSesi(kedi1); // miyavladı

        HayvanSesi(kopek1);
        HayvanSesi(kedi1);

        // setlerden HashSet
        // Maplardan HashMap
        // Listlerden ArrayList

        // Hayvanlardan Kedi
        // Hayvanlardan Köpek
        // Hayvanlardan hayvan

        //Referansın TİPİ  // NESNE'nin tipi
        Hayvan hayvan1=new Hayvan("Ördek");
        Hayvan hayvan2=new Kopek("Kangal");
        Hayvan hayvan3=new Kedi("Boncuk");

        System.out.println("-------------------------");
        hayvan1.ses(); // ses çıkardı
        hayvan2.ses(); // havladı
        hayvan3.ses(); // miyavladı
        System.out.println("-------------------------");

        ((Kopek)hayvan2).kokladi(); // nesneyi tanımladıktan sonra
                                   // diğer özelliklerine erişebilirsin

//                - Polymorphism -
//                çok formluluk  - Çok çeşitlilik
//                şizofren bir konu
//
//        Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

//         öğretmenin okulda "fizik öğretmeniyim" demesi,
//         mahallede "öğretmenim" demesi gibi.


























    }

    public static void HayvanSesi(Hayvan hayvan){
        hayvan.ses();

        // Bir class'ın aslında kim olduğunu bulma yöntemi
        if (hayvan instanceof Kopek) // hayvan aslında köpekse
           ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi) // hayvan aslında kediyse
            ((Kedi)hayvan).tirmaladi();



    }

    public static void KopekSesi(Kopek Kopek){
        Kopek.ses();

    }

    public static void KediSesi(Kedi Kedi){
        Kedi.ses();

    }
}

//  Hayvan classından türettiğimiz-extend yaptığımız için
//  hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
//  köpek ve kedi için classlarında Override yaparak yazdığımız
//  özellikleri alarak yazdı.
//  Ama tırmaladı , kokladı gibi kedi, köpek classına özel olarak
//  yazdıklarımızı hayvanSesi methodunda yazdıramayız.
