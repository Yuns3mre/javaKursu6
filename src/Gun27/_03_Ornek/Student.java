package Gun27._03_Ornek;

import java.util.ArrayList;

 class Student {

     // 2. Adım
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersYazdir()
    {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın, " + name);
        System.out.println("Aldığınız dersler aşağıdadır.");

        for( Lesson d : this.dersleri )
            System.out.println(d.name+"-"+d.saat);
    }

    public static void universiteKurallari() // 6. Adım
         {
             System.out.println("Kural 1 : Çaysız ve üzümsüz gelme");
             System.out.println("Kural 2 : Uykunu mutlaka al, sağlık en önemlisi");
             System.out.println("Kural 3 : Her zaman dinç, dinamik ve pozitif ol");
             System.out.println("Kural 4 : En başta verdiğin sözü unutma, şu an kamptasın");
             System.out.println("Kural 5 : İnş, biz bu işi tamamlayacağız.");
             System.out.println("Tekrarsız derse gelme");
             System.out.println("Kendi hatasını bulan kraldır");

         }


}
  