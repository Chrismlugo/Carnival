public class Customer {
    private String name;
    private double cash;


    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public String getName() {
        return name;
    }
}
