package Gun30;

public class KimlerDinledi {
    int a;
    static int b=0;

    void arrtir(){
        a++;
        b++;

    }

    public static void main(String[] args) {
        KimlerDinledi kd1=new KimlerDinledi();
        kd1.a=5;

        KimlerDinledi kd2=new KimlerDinledi();
        kd2.a=7;

        // 1. Soru a'nın değeri şu an kaçtır?
        // Burada her nesnenin a'sı var ve kd1'in 5, kd2'nin 7 değeri var

        System.out.println("kd1.a= " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);

        // b'nin değeri kaçtır?
        // b'nin tek bir değerii var bu yüzden 0'dır

        kd1.arrtir(); // kd1.a -> 6, b-> 1
        kd2.arrtir(); // kd1.a -> 8, b-> 2

        // 3. Soru a ve b'nin değeri kaçtır?
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd2.a = " + kd2.a);
        System.out.println("b = " + b);



    }
}
