package fabricaabstracta;
//package patterns.creational.abstractFactory.furniture;

public class VictorianChair implements Chair
{
    @Override
    public void sitOn(String person)
    {
        System.out.println(person + " is sitting on a victorian chair");
    }
}
