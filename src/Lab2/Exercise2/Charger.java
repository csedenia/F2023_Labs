package Lab2.Exercise2;

interface Chargeable {
    public void charge();
}
public class Charger {
    public void charge(Chargeable c) {
        c.charge();
    }
}