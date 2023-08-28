package Gun43;

public class _07_TryCatchFinally {
    public static void main(String[] args) {
        String str="";
        long startTime=0;

        try {
            startTime=System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım burası");
            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki kısım burası");

        }catch (Exception ex){
            System.out.println("Catch bloğu çalıştı");
            // Hata olduğunda yapılacaklar
        }
        finally { // Hata olsa da olmasa da çalışıyor
            // Try catch bloğuyla ilgili kodlar yazılır
            System.out.println(System.currentTimeMillis()-startTime);
        }

        System.out.println("Diğer çalışacak kodlar");
        System.out.println("Program bitti");




    }
}
