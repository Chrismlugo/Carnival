import java.util.ArrayList;

public abstract class Attraction {
    String name;
    double price;
    int capacity;
    int ageRestriction;
    ArrayList<Customer> customers;
    ArrayList<Customer> queue;

    public Attraction(String name, double price, int capacity, int ageRestriction) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.ageRestriction = ageRestriction;
        this.customers = new ArrayList<>();
        this.queue = new ArrayList<>();
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
             // check if the customer is old enough
            if (customer.getAge() > ageRestriction) {
                // check if there is space on the ride
                if (checkForSpace() > 0) {
                    // charge customer
                    charge(customer);
                    // add customer to the attraction
                    this.queue.remove(customer);
                    this.customers.add(customer);
                }
            }
    }

    public void remove(){
        customers.clear();
    }



    public int countCustomers() {
       return this.customers.size();
    }

    public int countCustomersInQueue(){
        return this.queue.size();
    }


    public int checkForSpace() {
        int capacity = this.capacity;
        int spacesTaken = countCustomers();

        return capacity - spacesTaken;
    }

//    public abstract String action();


    public void addToQueue(Customer customer) {
        queue.add(customer);
    }

    public void removeFromQueue(Customer customer){
        queue.remove(0);
    }
}
