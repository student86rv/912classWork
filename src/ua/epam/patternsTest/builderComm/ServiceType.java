package ua.epam.patternsTest.builderComm;

public enum ServiceType {
    ELECTRO (10), WATER (15), GAS (20), ELEVATOR (25);

    private int price;

    ServiceType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
