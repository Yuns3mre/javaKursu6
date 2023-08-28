package Gun11;

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class _08_JavaMath {
    public static void main(String[] args) {


        // Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner read=new Scanner(System.in);
        System.out.print("sayı1=");
        int sayi1= read.nextInt();

        System.out.print("sayı2=");
        int sayi2= read.nextInt();

        System.out.print("sayı3=");
        int sayi3= read.nextInt();




        System.out.println("verilenlerden büyük olan sayı= " + Math.max((Math.max(sayi1,sayi2)),sayi3));









    }
}
