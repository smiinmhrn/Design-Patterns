package behavioural.State;

public class Driving implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 4;
    }
}
