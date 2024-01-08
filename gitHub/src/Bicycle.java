public class Bicycle extends Vehicle {
    private double price;

    public Bicycle(String make, String model, int year, double price) {
        super(make, model, year);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
