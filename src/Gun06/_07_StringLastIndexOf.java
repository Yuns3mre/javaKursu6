package Gun06;

public class _07_StringLastIndexOf {
    public static void main(String[] args) {

        // indexOf: baştan sona doğru aranan değeri bulur
        // ama lastIndexOf sondan başa doğru gider

        String cumle="Merhaba Dünya";

        System.out.println("cumle.indexOf(a) = " + cumle.indexOf("a")); // 4
        System.out.println("cumle.lastIndexOf(a) = " + cumle.lastIndexOf("a"));  //12
        // index her zaman tektir arama yönüne göre değişmez soldan-sağa 0-12 arasında değer alır
        System.out.println("cumle.lastIndexOf(a) = " + cumle.lastIndexOf("a",8));  //6
    }
}
