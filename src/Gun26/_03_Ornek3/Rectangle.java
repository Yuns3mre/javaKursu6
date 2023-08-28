package Gun26._03_Ornek3;

public class Rectangle {

    int width;
    int lenght;

    public void cevre(){
        int cevre= (this.width+this.lenght)*2;
        System.out.println("cevre = " + cevre);
    }

    public void alan(){
        int alan = (this.width*this.lenght);
        System.out.println("alan = " + alan);


    }

    public int cevre2(){
        int cevre = (this.width+this.lenght)*2;
        return cevre;
    }

    public int alan2(){
        int alan = (this.width*this.lenght);
    return alan;

    }

}
