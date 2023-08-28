package Gun06;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {

        // Kullanıcıdan cadde, sokak, postaKodu, ülke ve ev sahibi eklinde adres bilgisini alarak yazınız

        Scanner readStr=new Scanner(System.in);
        Scanner readInt=new Scanner(System.in);
        Scanner readBoolen=new Scanner(System.in);



        System.out.print("Hangi cadde? =");
        String cadde= readStr.nextLine();
        System.out.print("Hangi sokak? =");
        String sokak=readStr.nextLine();
        System.out.print("Hangi ülke? =");
        String ulke= readStr.nextLine();
        System.out.print("Hangi posta kodu? =");
        int postaKodu= readInt.nextInt();
        System.out.print("Ev sahibi misiniz?(T/F) =");
        boolean evSahibi= readBoolen.nextBoolean();

        System.out.println("Adres="+cadde+"  "+sokak+"  "+postaKodu+"  "+ulke+"  "+evSahibi);










    }
}
