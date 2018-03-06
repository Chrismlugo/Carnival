import java.util.ArrayList;

public abstract class Attraction {
    String name;
    double price;
    int capacity;
    int ageRestriction;
    int heightRestriction;
    ArrayList<Customer> customers;

    public Attraction(String name, double price, int capacity, int ageRestriction, int heightRestriction) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.ageRestriction = ageRestriction;
        this.heightRestriction = heightRestriction;
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

    public void charge(Customer customer){
        double result = customer.getCash() - price;
        customer.setCash(result);
    }

    public void add(Customer customer) {
            if (customer.getAge() > ageRestriction) {
                // check if there is space on the ride
                if (checkForSpace() > 0) {
                    // add customer to ride if there is a space
                    this.customers.add(customer);
                    charge(customer);
                    action();
                }
            }
    }



    public int countCustomers() {
       return this.customers.size();
    }


    public int checkForSpace() {
        int capacity = this.capacity;
        int spacesTaken = countCustomers();

        return capacity - spacesTaken;
    }

    public abstract String action();
}
