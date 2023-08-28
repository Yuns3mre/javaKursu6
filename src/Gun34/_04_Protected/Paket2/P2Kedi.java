package Gun34._04_Protected.Paket2;


import Gun34._04_Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String ad, String cinsi) {
        this.adi= ad;
        this.cins= cinsi; // protected
        // defeulttan farklı olarak
        // extends edildiğinde diğer paketlerden de
        // erişilebilir
    }
}
