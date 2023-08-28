package Gun45;

public class S56_2 {
    public static void main(String[] args) {

    String names[]={"Thomas","Peter","Joseph"};
    String pwd[]=new String[3];
    int idx=0;


    for (String n : names){
        try {
            pwd[idx]=n.substring(2,6); // 2 ve 5 dahil demek
            System.out.println(pwd[idx]); // omas yazıldı
            idx++;
        }catch (Exception e){
            System.out.println("Invalid Name"); // omas,Invalid Name,seph (Peter'da 5 dahil değil)
        }
    }
    for (String s : pwd)
        System.out.println("s = " + s);
}
}
