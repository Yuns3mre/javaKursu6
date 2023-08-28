package Gun28._03_Ornek;

public class Kitap {
    String name;
    int publishYear;
    String author;

    // 2 Tık yap Generate yap, Contructor/toString yap sonra seçerek yazdır

    public Kitap(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    public Kitap() {
    }

    public Kitap(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }


    public String toString() {
        return "Kitap{" +
                "name='" + this.name + '\'' +
                ", publishYear=" + this.publishYear +
                ", author='" + this.author + '\'' +
                '}';
    }
}
