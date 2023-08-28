package Gun04;

public class _07_Ornek3 {
    public static void main(String[] args) {
   // String olarak verilen notun ("80", "95","56") ortalamasını bulunuz

        String not1="82";
        String not2="95";
        String not3="56";

        int rakamNot1=Integer.parseInt(not1);
        int rakamNot2=Integer.parseInt(not2);
        int rakamNot3=Integer.parseInt(not3);

        int toplamNot= rakamNot1+rakamNot2+rakamNot3;
        double notOrtalama= (double) toplamNot/3;
        System.out.println("Not Ortalaması = " + notOrtalama);







    }
}
