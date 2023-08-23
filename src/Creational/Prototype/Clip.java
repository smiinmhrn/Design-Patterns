package Creational.Prototype;

public class Clip implements Component {
    @Override
    public Component clone() {
        return new Clip();
    }
}
