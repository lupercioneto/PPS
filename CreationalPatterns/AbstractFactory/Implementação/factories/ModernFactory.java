package factories;

import produtos.*;
import produtos.Modernos.*;

public class ModernFactory implements AbstractFactory{
    
    @Override
    public Mesa createMesa() {
        return new MesaModerna();
    }
    
    @Override
    public Sofa createSofa() {
        return new SofaModerno();
    }
}
