package ua.epam.patternsTest;

public class OpelFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Opel();
    }
}
