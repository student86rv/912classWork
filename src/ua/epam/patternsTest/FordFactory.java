package ua.epam.patternsTest;

public class FordFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }
}
