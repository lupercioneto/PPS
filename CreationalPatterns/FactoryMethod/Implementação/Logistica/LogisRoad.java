import Transportes.Transporte;
import Transportes.Truck;

public class LogisRoad extends Logis {
    @Override
    public Transporte createTransport() {
        return new Truck(30, 300);
    }

    @Override
    public void initializeTravel() {
        System.out.println("Initializing travel by Truck");
    }
}