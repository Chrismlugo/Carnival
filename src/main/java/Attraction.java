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
        this.customers = new ArrayList<>();
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


    public void add(Customer customer) {
        if(countCustomers() < capacity) {
            this.customers.add(customer);
        }
    }

    public int countCustomers() {
       return this.customers.size();
    }


    public int checkForSpace() {

    }
}
