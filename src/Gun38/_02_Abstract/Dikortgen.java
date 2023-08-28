package Gun38._02_Abstract;

public class Dikortgen extends Sekil{
    private double kisaKenar;
    private double uzunKenar;

    public Dikortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    double alan() {
        return (this.uzunKenar*this.kisaKenar);
    }

    @Override
    double cevre() {
        return 2*(this.uzunKenar+this.kisaKenar);
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }


}
