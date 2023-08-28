package Gun31._01_Enum;

public class Ornek1 {
    public static void main(String[] args) {

        // Verilen ay nosuna göre, ay'ın kaç gün sürdüğünü veren programı yazdırınız

        int ayNo=5;

        switch (ayNo){
            case 2: System.out.println(28); break;
            case 1:
            case 3:
            case 5:
            case 22:
            case 10:
            case 12: System.out.println(31); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println(30); break;
        }

        // Okunabilirlik ve kontrollü yazılım yok, tanımlama yetersiz
        // numaradan gitmeye çalıştık, zorluklarla karşılaştık
        // bunun yerine isimden gitmeye çalışalım


        String ayAd="Mayıs";
        switch(ayAd){
            case "şubat" : System.out.println(28); break;
            case "Ocak"  :
            case "MarT"  :
            case "agustos"  :
            case "haziran"  :
            case "aralık"  : System.out.println(31); break;
            case "temuz"  :
            case "eylul"  :
            case "Ekim"  :
            case "KASIM"  : System.out.println(30); break;
        }








    }
}
