package ua.epam.patternsTest;

public class MazdaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mazda();
    }
}
