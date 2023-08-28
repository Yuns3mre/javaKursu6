package Gun34._04_Protected.Paket2;

import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan p1h=new P1Hayvan();
        p1h.adi="Karakedi"; // public old. için ulaşıldı
        // yas default old. için ulaşılmadı
        // cinsi protected

        P2Kedi p2k=new P2Kedi("","");


    }
}
