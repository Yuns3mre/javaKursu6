package Gun37._01_Soru;

public class ToyotaPirus extends Vehicle implements IElectric,IGas{
    public ToyotaPirus(double engine, String model) {
        super(engine, model);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "İlk 3km elektrikle gider";
    }
}
