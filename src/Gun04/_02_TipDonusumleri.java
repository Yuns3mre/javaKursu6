package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {

        byte ogrNot1=98;
        byte ogrNot2=97;
        byte ogrNot3=95;
        byte ogrNot4=100;

        // int     byte geçişi oluyor
        int toplamNot= ogrNot1+ogrNot2+ogrNot3+ogrNot4;
        System.out.println("toplamNot = " + toplamNot);
     // intin hafızadaki yeri büyük olduğu için daha çok deper kaplar

        ogrNot2= (byte) toplamNot; // parantez içindeki dönüşümü yapmazsak kabul etmez !!!!
        System.out.println("ogrNot2 = " + ogrNot2); // bu fonksiyon için görüntü kümesinde yanlış eleman verir
        // bunları yapma sebebpleri arasında ondalıklı bir sayının sadece tam kısımlarını kullanmak gerekebilir
       // int -> byte atınca dur bakalım dedi (Daraltma)
        // Büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma işlemi var. Bu da veri kaybı sağlar.









    }
}
