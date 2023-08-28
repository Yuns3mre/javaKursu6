package Gun16;

public class _06_JavvaArray {
    public static void main(String[] args) {

        // 5 TV kanalı ismini bir diziye doldurunuz. TRT, kanalD, Fox, HaberTürk,ATV
        // Daha sonra random olarak olarak biir tanesini seçip yazdırınız


        String[] kanal= {"TRT","ATV", "KanalD","Fox" ,"HaberTürk"};

       int rndIndex=(int)(Math.random() * kanal.length);

        System.out.println("Rastgele seçilen kanal= " + kanal[rndIndex]);






    }
}
