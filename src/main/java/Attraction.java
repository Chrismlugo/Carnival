import java.util.ArrayList;

public class Attraction {
    String name;
    double price;
    int capacity;
    int ageRestriction;
    ArrayList<Customer> customers;

    public Attraction(String name, double price, int capacity, int ageRestriction) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.ageRestriction = ageRestriction;
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
        // if the customers age is over the age restriction
        if(customer.getAge() > ageRestriction ){
        // check if there is space on the ride
        if(checkForSpace() > 0) {
        // add customer to ride if there is a space
                this.customers.add(customer);
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
}
