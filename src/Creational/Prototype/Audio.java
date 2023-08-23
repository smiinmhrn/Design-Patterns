package Creational.Prototype;

public class Audio implements Component {
    @Override
    public Component clone() {
        return new Audio();
    }
}
