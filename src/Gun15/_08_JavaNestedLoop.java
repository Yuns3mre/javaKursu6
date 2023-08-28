package Gun15;

public class _08_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız (Yalnızca 1 yıldız kullanarak)
        // *      1.satırda 1 yıldız
        // **     2.satırda 2 yıldız
        // ***    3.satırda 3 yıldız
        // ****   4.satırda 4 yıldız
        // *****  5.satırda 5yıldız


        for (int satir = 1; satir <= 5; satir++) {

            for (int i = 1; i <= satir; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }


}

