package Gun45;

public class S64_2 {
    public static void main(String[] args) {

        String[] arr={"A","B","C","D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

            if (arr[i].equals("C")){
                continue; // continue pas geçiyordu hatırla
            }

            System.out.println("Work Done");
        }







    }
}