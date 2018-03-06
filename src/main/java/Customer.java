public class Customer {
    private String name;
    private double cash;
    private int age;


    public Customer(String name, double cash, int age) {
        this.name = name;
        this.cash = cash;
        this.age = age;
    }

    public double getCash() {
        return cash;
    }

    public String getName() {
        return name;
    }
}
