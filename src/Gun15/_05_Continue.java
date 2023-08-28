package Gun15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {

        // girilen bir  Stringin harflerini teker teker  alt alta
        // olacak  şekilde yazdır, boşlukları yazmasın


        Scanner read = new Scanner(System.in);
        System.out.print("cümle giriniz=");
        String cumle = read.nextLine();

        for (int i = 0; i < cumle.length(); i++) {


            if (cumle.charAt(i) == ' ')
                continue;
            System.out.println(cumle.charAt(i));


        }


    }
}
