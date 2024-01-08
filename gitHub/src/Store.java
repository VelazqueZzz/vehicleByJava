import java.util.ArrayList;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car1 = new Car("Toyota", "Camry", 2021, 30000);
        Car car2 = new Car("Honda", "Civic", 2020, 25000);

        Bicycle bike1 = new Bicycle("Trek", "Domane AL 2", 2021, 500);
        Bicycle bike2 = new Bicycle("Giant", "Escape 3", 2020, 600);

        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(bike1);
        vehicles.add(bike2);

        double totalPrice = 0;
        for (Vehicle vehicle : vehicles) {
            totalPrice += vehicle.getPrice();
        }

        System.out.println("Total price of all vehicles: $" + totalPrice);
    }
}