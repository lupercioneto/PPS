package factories;

import produtos.*;
import produtos.Vitorianos.*;

public class VictorianFactory implements AbstractFactory{
    
    @Override
    public Mesa createMesa() {
        return new MesaVitoriana();
    }
    
    @Override
    public Sofa createSofa() {
        return new SofaVitoriano();
    }
}
