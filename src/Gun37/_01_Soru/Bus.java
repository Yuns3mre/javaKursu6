package Gun37._01_Soru;

public class Bus extends Vehicle implements IDeisel{
    public Bus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeDeisel() {
        return "1 depo ile 1000km gider";
    }

    @Override
    public String drive() {
        return "En fazla 90km hız yapabilir";
    }
}
