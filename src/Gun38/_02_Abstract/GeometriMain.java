package Gun38._02_Abstract;

public class GeometriMain {
    public static void main(String[] args) {

        Dikortgen d=new Dikortgen(5,4);
        d.setName("Yeni Dikdörtgen");
        d.ciz();
        System.out.println(d);

        System.out.println("--------------------");

        Daire dr=new Daire(4);
        dr.setName("Yeni Daire");
        dr.ciz();
        System.out.println(dr);





    }
}
