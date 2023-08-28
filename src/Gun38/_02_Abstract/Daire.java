package Gun38._02_Abstract;

public  class Daire extends Sekil{

    private double yariCap;

    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    @Override
    double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    double cevre() {
        return 2*Math.PI*yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }
}
