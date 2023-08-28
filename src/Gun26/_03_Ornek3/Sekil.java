package Gun26._03_Ornek3;

public class Sekil {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();

        r.lenght=5;
        r.width=4;

        r.cevre();
        r.alan();
        
        int cevre=r.cevre2();
        System.out.println("r.cevre2() = " + r.cevre2());

        
        int alan= r.alan2();
        System.out.println("r.alan2() = " + r.alan2());



    }
}

