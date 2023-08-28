package Gun31._02_Soru;

public class Program {
    public static void main(String[] args) {

       User user1=new User("ismet",Role.ADMIN,Status.AKTIF);
       User user2=new User("mehmet",Role.SATIS,Status.PASIF);
       User user3=new User("ayşe",Role.MUDUR,Status.AKTIF);

       User.userSil(user1); // Admin silinemez
       User.userSil(user2); // user silindi
       User.userSil(user3); // user silindi










      // if (user1.role==Role.ADMIN){
           // Kullanıcı silme işlemleri
       //}


    }
}
