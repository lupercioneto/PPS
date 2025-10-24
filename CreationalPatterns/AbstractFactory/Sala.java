import factories.AbstractFactory;
import produtos.*;

public class Sala {
    private Mesa mesa;
    private Sofa sofa;
    
    public Sala(AbstractFactory factory) {
        mesa = factory.createMesa();
        sofa = factory.createSofa();
    }

    public void showSurface() {
        mesa.showSurface();
        sofa.showSurface();
    }
}
