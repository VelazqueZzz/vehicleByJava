public class Car extends Vehicle {
    private double price;

    public Car(String make, String model, int year, double price) {
        super(make, model, year);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
