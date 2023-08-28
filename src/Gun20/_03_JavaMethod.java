package Gun20;

import Tools.MyFunc;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

        // Kullanıcıdan gireceği 2 sayının büyük olanını
        // bulma işlemini bir metoddan yaptıktan sonra mainde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı1= ");
        int sayi1= oku.nextInt();
        System.out.print("sayı2= ");
        int sayi2= oku.nextInt();

       int enb= enBul(sayi1,sayi2);

       enb= MyFunc.enbul(sayi1,sayi2); /*****/

        System.out.println("enb = " + enb);
    }
    public static int  enBul(int s1,int s2) // metodun imzası
    {
        return (s1>s2 ? s1 : s2);
    }


}
