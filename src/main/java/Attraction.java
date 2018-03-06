import java.util.ArrayList;

public abstract class Attraction {
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

    public void charge(Customer customer){
        double result = customer.getCash() - price;
        customer.setCash(result);
    }

    public void add(Customer customer) {
            if (customer.getAge() > ageRestriction) {
                // check if there is space on the ride
                if (checkForSpace() > 0) {
                    // charge customer
                    charge(customer);
                    // add customer to the attraction
                    this.customers.add(customer);
                    action();
                }
            }
    }

    public void remove(){
        customers.clear();
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
