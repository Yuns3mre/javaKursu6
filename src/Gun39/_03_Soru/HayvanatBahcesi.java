package Gun39._03_Soru;

public class HayvanatBahcesi {
    public static void main(String[] args) {


        Kedi kd=new Kedi("Köpük",false,"01/01/2015");
        System.out.println(kd.getClass().getSimpleName());
        System.out.println(kd);

        Kartal kr=new Kartal("Kara Kartal",true,"17/02/2020");
        System.out.println(kr.getClass().getSimpleName());
        System.out.println(kr);

    }
}
