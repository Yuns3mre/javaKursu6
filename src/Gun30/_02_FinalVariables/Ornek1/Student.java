package Gun30._02_FinalVariables.Ornek1;

public class Student {
     final int id;
    // değiştirilemez
    // yani sadece 1 kez veri atama şansı oluyor
    String fullname; // nesneye ait

   private static int sayac=1; // class'a ait



    public Student(int id, String fullname) {
        this.id = id;
        // final değişkenlerine sadece 1 kez veri atanabilir.
        // o da ya tanımlanırken , ya da Constructor da
        this.fullname = fullname;
    }

    public Student(String fullname) {
        this.fullname = fullname;
        this.id=sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
