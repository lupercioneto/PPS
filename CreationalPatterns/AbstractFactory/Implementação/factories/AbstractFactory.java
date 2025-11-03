package factories;

import produtos.*;

public interface AbstractFactory {
    public Mesa createMesa();
    public Sofa createSofa();
}
