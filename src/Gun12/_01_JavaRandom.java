package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {

        double randSayi= Math.random(); // 0-0,9999999999 aralıığında bişeyler sallar
        System.out.println("randSayi = " + randSayi);

       // Ben bana verilen bu ondalıklı değeri gide 10'la çarpasam tam kısım oluşmuş olur
       // ve bunun int kısmını alırsam da int sayı olmuş olur

        int rndTamSayi=(int) (randSayi*10);
        System.out.println("rndTamSayi = " + rndTamSayi);














    }
}
