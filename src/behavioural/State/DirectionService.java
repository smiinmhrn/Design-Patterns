package behavioural.State;

public class DirectionService {
    TravelMode travelMode;

    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
    public Object getEta() {
        return travelMode.getEta();
    }
    public Object getDirection() {
        return travelMode.getDirection();
    }
}
