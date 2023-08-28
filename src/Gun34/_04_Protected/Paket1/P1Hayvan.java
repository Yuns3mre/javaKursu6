package Gun34._04_Protected.Paket1;

public class P1Hayvan {
   public String adi; // Herkese açık, bütün paketlerden ulaşılır
    int yas; // default: sadece bulunduğu pakketten erişim var
   protected String cins; // defult gibi ama sadece bir yöntemle diğer paketlerden erişilebilir
   private String renk; // sadece kendi bulunduğu class içinden erişilebilir


}
