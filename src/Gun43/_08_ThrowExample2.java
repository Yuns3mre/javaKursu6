package Gun43;

import java.util.Scanner;

public class _08_ThrowExample2 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("Yeni şifre oluşruma");

        System.out.print("Yeni şifre= ");
        String newPassword= oku.nextLine();

        try {


            if (newPassword.length() < 8) // Bu mesaj ile suni hata oluştur
              throw  new Exception("Şifre en az 8 karakter olmalı");


            if (newPassword.length() > 15) // Bu mesaj ile suni hata oluştur
                System.out.println("Şifre en fazla 15 karakter olmalı");
        }catch (Exception ex){
            // Hataları bir yere toplayıp, hepsi için yapılması gereken işlemler
            // birarada buarad yapılabilir. Mesela log tutma gibi
            System.out.println("Lütfen dikkat !");
            System.out.println(ex.getMessage());
            // Hangi IP den bağlandı
            // Yaplıacak ortak işler
        }


    }
}
