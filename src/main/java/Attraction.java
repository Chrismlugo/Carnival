import java.util.ArrayList;

public class Attraction {
    String name;
    double price;
    int capacity;
    ArrayList<Customer> customers;

    public Attraction(String name, double price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public int getCapacity() {
        return capacity;
    }


}
