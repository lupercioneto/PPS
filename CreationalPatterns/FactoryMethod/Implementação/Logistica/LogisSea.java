import Transportes.Ship;

public class LogisSea extends Logis {
    
    @Override
    public Ship createTransport() {
        return new Ship(400, 1000);
    }

    public void initializeTravel() {
        System.out.println("Initializing travel by Ship");
    }
}
