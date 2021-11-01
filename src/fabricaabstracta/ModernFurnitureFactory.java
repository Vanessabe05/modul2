package fabricaabstracta;
//package patterns.creational.abstractFactory.furniture;

public class ModernFurnitureFactory implements FurnitureFactory
{
    @Override
    public Chair createChair()
    {
        return new ModernChair();
    }

    @Override
    public Table createTable()
    {
        return new ModernTable();
    }
    
    public Sofa  createSofa() {
    	
    	return new ModernSofa();
    }
}
