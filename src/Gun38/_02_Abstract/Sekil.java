package Gun38._02_Abstract;

public abstract class Sekil {
    private String name;

    abstract double alan();
    abstract double cevre();

    public void ciz(){
        System.out.println(name+" "+"Şekli çizildi");
    }

    @Override
    public String toString() {
        return "Sekil:" +
                "\nName=" + name+
                "\nAlan=" + alan()+
                "\nÇevre=" + cevre();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
